/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package minicloud.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import minicloud.client.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-11T02:45:50.392067379+02:00[Europe/Berlin]")
@Validated
@Tag(name = "server group", description = "Operations about the server groups")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/v1/group : Get all server groups
     *
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "apiV1GroupGet",
        summary = "Get all server groups",
        tags = { "server group" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ServerGroup.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/group",
        produces = { "application/json" }
    )
    default ResponseEntity<List<ServerGroup>> apiV1GroupGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"template\" : \"lobby-template\", \"name\" : \"lobby\", \"ports\" : [ { \"target-port\" : 25565, \"protocol\" : \"tcp\", \"publish-mode\" : \"ingress\", \"published-port\" : 25565, \"name\" : \"minecraft\" }, { \"target-port\" : 25565, \"protocol\" : \"tcp\", \"publish-mode\" : \"ingress\", \"published-port\" : 25565, \"name\" : \"minecraft\" } ], \"max-players-per-server\" : 20 }, { \"template\" : \"lobby-template\", \"name\" : \"lobby\", \"ports\" : [ { \"target-port\" : 25565, \"protocol\" : \"tcp\", \"publish-mode\" : \"ingress\", \"published-port\" : 25565, \"name\" : \"minecraft\" }, { \"target-port\" : 25565, \"protocol\" : \"tcp\", \"publish-mode\" : \"ingress\", \"published-port\" : 25565, \"name\" : \"minecraft\" } ], \"max-players-per-server\" : 20 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v1/group/{name} : Delete an existing server group
     *
     * @param name Name of the server group (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Server group not found (status code 409)
     */
    @Operation(
        operationId = "apiV1GroupNameDelete",
        summary = "Delete an existing server group",
        tags = { "server group" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "409", description = "Server group not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/group/{name}"
    )
    default ResponseEntity<Void> apiV1GroupNameDelete(
        @Parameter(name = "name", description = "Name of the server group", required = true, in = ParameterIn.PATH) @PathVariable("name") String name
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/group/{name} : Get the server group
     *
     * @param name Name of the server group (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Server group not found (status code 404)
     */
    @Operation(
        operationId = "apiV1GroupNameGet",
        summary = "Get the server group",
        tags = { "server group" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ServerGroup.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "Server group not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/group/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<ServerGroup> apiV1GroupNameGet(
        @Parameter(name = "name", description = "Name of the server group", required = true, in = ParameterIn.PATH) @PathVariable("name") String name
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"template\" : \"lobby-template\", \"name\" : \"lobby\", \"ports\" : [ { \"target-port\" : 25565, \"protocol\" : \"tcp\", \"publish-mode\" : \"ingress\", \"published-port\" : 25565, \"name\" : \"minecraft\" }, { \"target-port\" : 25565, \"protocol\" : \"tcp\", \"publish-mode\" : \"ingress\", \"published-port\" : 25565, \"name\" : \"minecraft\" } ], \"max-players-per-server\" : 20 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/group/{name}/servers : Get all servers of the group
     *
     * @param name Name of the server group (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Server group not found (status code 404)
     */
    @Operation(
        operationId = "apiV1GroupNameServersGet",
        summary = "Get all servers of the group",
        tags = { "server group" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ServerList.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "Server group not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/group/{name}/servers",
        produces = { "application/json" }
    )
    default ResponseEntity<ServerList> apiV1GroupNameServersGet(
        @Parameter(name = "name", description = "Name of the server group", required = true, in = ParameterIn.PATH) @PathVariable("name") String name
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"servers\" : [ { \"ip-address\" : \"10.0.0.11\", \"online-players\" : 4, \"name\" : \"lobby-1\", \"group\" : \"lobby\", \"status\" : \"starting\" }, { \"ip-address\" : \"10.0.0.11\", \"online-players\" : 4, \"name\" : \"lobby-1\", \"group\" : \"lobby\", \"status\" : \"starting\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v1/group : Create a new server group
     *
     * @param serverGroup Create a new server group (required)
     * @return Successful operation (status code 201)
     *         or Invalid input (status code 400)
     *         or Server group already exists (status code 409)
     */
    @Operation(
        operationId = "apiV1GroupPost",
        summary = "Create a new server group",
        tags = { "server group" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ServerGroup.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "409", description = "Server group already exists")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/group",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ServerGroup> apiV1GroupPost(
        @Parameter(name = "ServerGroup", description = "Create a new server group", required = true) @Valid @RequestBody ServerGroup serverGroup
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"template\" : \"lobby-template\", \"name\" : \"lobby\", \"ports\" : [ { \"target-port\" : 25565, \"protocol\" : \"tcp\", \"publish-mode\" : \"ingress\", \"published-port\" : 25565, \"name\" : \"minecraft\" }, { \"target-port\" : 25565, \"protocol\" : \"tcp\", \"publish-mode\" : \"ingress\", \"published-port\" : 25565, \"name\" : \"minecraft\" } ], \"max-players-per-server\" : 20 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/server : Get all servers
     *
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "apiV1ServerGet",
        summary = "Get all servers",
        tags = { "server" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Server.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/server",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Server>> apiV1ServerGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"ip-address\" : \"10.0.0.11\", \"online-players\" : 4, \"name\" : \"lobby-1\", \"group\" : \"lobby\", \"status\" : \"starting\" }, { \"ip-address\" : \"10.0.0.11\", \"online-players\" : 4, \"name\" : \"lobby-1\", \"group\" : \"lobby\", \"status\" : \"starting\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v1/server/{name} : Delete an existing server
     *
     * @param name Name of the server (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Server not found (status code 404)
     */
    @Operation(
        operationId = "apiV1ServerNameDelete",
        summary = "Delete an existing server",
        tags = { "server" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "Server not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/server/{name}"
    )
    default ResponseEntity<Void> apiV1ServerNameDelete(
        @Parameter(name = "name", description = "Name of the server", required = true, in = ParameterIn.PATH) @PathVariable("name") String name
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/server/{name} : Get the server
     *
     * @param name Name of the server (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Server not found (status code 404)
     */
    @Operation(
        operationId = "apiV1ServerNameGet",
        summary = "Get the server",
        tags = { "server" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Server.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "Server not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/server/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<Server> apiV1ServerNameGet(
        @Parameter(name = "name", description = "Name of the server", required = true, in = ParameterIn.PATH) @PathVariable("name") String name
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ip-address\" : \"10.0.0.11\", \"online-players\" : 4, \"name\" : \"lobby-1\", \"group\" : \"lobby\", \"status\" : \"starting\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v1/server : Create a new server
     *
     * @param apiV1ServerPostRequest Create a new server (required)
     * @return Successful operation (status code 201)
     *         or Invalid input (status code 400)
     *         or Server already exists (status code 409)
     */
    @Operation(
        operationId = "apiV1ServerPost",
        summary = "Create a new server",
        tags = { "server" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Server.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "409", description = "Server already exists")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/server",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Server> apiV1ServerPost(
        @Parameter(name = "ApiV1ServerPostRequest", description = "Create a new server", required = true) @Valid @RequestBody ApiV1ServerPostRequest apiV1ServerPostRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ip-address\" : \"10.0.0.11\", \"online-players\" : 4, \"name\" : \"lobby-1\", \"group\" : \"lobby\", \"status\" : \"starting\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/template : Get all templates
     *
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "apiV1TemplateGet",
        summary = "Get all templates",
        tags = { "template" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Template.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/template",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Template>> apiV1TemplateGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"size\" : 0, \"name\" : \"lobby-template\", \"command\" : \"java -jar server.jar\", \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\" }, { \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"size\" : 0, \"name\" : \"lobby-template\", \"command\" : \"java -jar server.jar\", \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v1/template/{name} : Delete an existing template
     *
     * @param name Name of the template (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Template in use (status code 403)
     *         or Template not found (status code 404)
     */
    @Operation(
        operationId = "apiV1TemplateNameDelete",
        summary = "Delete an existing template",
        tags = { "template" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "403", description = "Template in use"),
            @ApiResponse(responseCode = "404", description = "Template not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/template/{name}"
    )
    default ResponseEntity<Void> apiV1TemplateNameDelete(
        @Parameter(name = "name", description = "Name of the template", required = true, in = ParameterIn.PATH) @PathVariable("name") String name
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/template/{name}/download : Downloads the template
     *
     * @param name Name of the template (required)
     * @return Successful operation (status code 200)
     *         or Empty template (status code 204)
     *         or Invalid input (status code 400)
     *         or Template not found (status code 404)
     */
    @Operation(
        operationId = "apiV1TemplateNameDownloadGet",
        summary = "Downloads the template",
        tags = { "template" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/octet-stream", schema = @Schema(implementation = org.springframework.core.io.Resource.class))
            }),
            @ApiResponse(responseCode = "204", description = "Empty template"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "Template not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/template/{name}/download",
        produces = { "application/octet-stream" }
    )
    default ResponseEntity<org.springframework.core.io.Resource> apiV1TemplateNameDownloadGet(
        @Parameter(name = "name", description = "Name of the template", required = true, in = ParameterIn.PATH) @PathVariable("name") String name
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/template/{name} : Get the template
     *
     * @param name Name of the template (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Template not found (status code 404)
     */
    @Operation(
        operationId = "apiV1TemplateNameGet",
        summary = "Get the template",
        tags = { "template" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Template.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "Template not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/template/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<Template> apiV1TemplateNameGet(
        @Parameter(name = "name", description = "Name of the template", required = true, in = ParameterIn.PATH) @PathVariable("name") String name
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"size\" : 0, \"name\" : \"lobby-template\", \"command\" : \"java -jar server.jar\", \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v1/template : Create a new template
     *
     * @param name Name of the template (required)
     * @param body The tar binary of the template folder (required)
     * @return Successful operation (status code 201)
     *         or Template already exists (status code 409)
     */
    @Operation(
        operationId = "apiV1TemplatePost",
        summary = "Create a new template",
        tags = { "template" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Template.class))
            }),
            @ApiResponse(responseCode = "409", description = "Template already exists")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/template",
        produces = { "application/json" },
        consumes = { "application/octet-stream" }
    )
    default ResponseEntity<Template> apiV1TemplatePost(
        @NotNull @Parameter(name = "name", description = "Name of the template", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "name", required = true) String name,
        @Parameter(name = "body", description = "The tar binary of the template folder", required = true) @Valid @RequestBody org.springframework.core.io.Resource body
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"size\" : 0, \"name\" : \"lobby-template\", \"command\" : \"java -jar server.jar\", \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/v1/template : Update the files of the template
     *
     * @param name Name of the template (required)
     * @param body The tar binary of the template folder (required)
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "apiV1TemplatePut",
        summary = "Update the files of the template",
        tags = { "template" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Template.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/template",
        produces = { "application/json" },
        consumes = { "application/octet-stream" }
    )
    default ResponseEntity<Template> apiV1TemplatePut(
        @NotNull @Parameter(name = "name", description = "Name of the template", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "name", required = true) String name,
        @Parameter(name = "body", description = "The tar binary of the template folder", required = true) @Valid @RequestBody org.springframework.core.io.Resource body
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"size\" : 0, \"name\" : \"lobby-template\", \"command\" : \"java -jar server.jar\", \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
