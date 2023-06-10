/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.InlineObject;
import org.springframework.core.io.Resource;
import org.openapitools.model.Server;
import org.openapitools.model.ServerGroup;
import org.openapitools.model.ServerList;
import org.openapitools.model.Template;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-11T00:49:16.499167298+02:00[Europe/Berlin]")

@Validated
@Api(value = "api", description = "the api API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Get all server groups", nickname = "apiV1GroupGet", notes = "", response = ServerGroup.class, responseContainer = "List", tags={ "server group", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = ServerGroup.class, responseContainer = "List") })
    @RequestMapping(value = "/api/v1/group",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ServerGroup>> apiV1GroupGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"template\" : \"lobby-template\",  \"name\" : \"lobby\",  \"ports\" : [ {    \"target-port\" : 25565,    \"protocol\" : \"tcp\",    \"publish-mode\" : \"ingress\",    \"published-port\" : 25565,    \"name\" : \"minecraft\"  }, {    \"target-port\" : 25565,    \"protocol\" : \"tcp\",    \"publish-mode\" : \"ingress\",    \"published-port\" : 25565,    \"name\" : \"minecraft\"  } ],  \"max-players-per-server\" : 20}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Delete an existing server group", nickname = "apiV1GroupNameDelete", notes = "", tags={ "server group", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 409, message = "Server group not found") })
    @RequestMapping(value = "/api/v1/group/{name}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> apiV1GroupNameDelete(@ApiParam(value = "Name of the server group",required=true) @PathVariable("name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get the server group", nickname = "apiV1GroupNameGet", notes = "", response = ServerGroup.class, tags={ "server group", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = ServerGroup.class),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 404, message = "Server group not found") })
    @RequestMapping(value = "/api/v1/group/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ServerGroup> apiV1GroupNameGet(@ApiParam(value = "Name of the server group",required=true) @PathVariable("name") String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"template\" : \"lobby-template\",  \"name\" : \"lobby\",  \"ports\" : [ {    \"target-port\" : 25565,    \"protocol\" : \"tcp\",    \"publish-mode\" : \"ingress\",    \"published-port\" : 25565,    \"name\" : \"minecraft\"  }, {    \"target-port\" : 25565,    \"protocol\" : \"tcp\",    \"publish-mode\" : \"ingress\",    \"published-port\" : 25565,    \"name\" : \"minecraft\"  } ],  \"max-players-per-server\" : 20}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get all servers of the group", nickname = "apiV1GroupNameServersGet", notes = "", response = ServerList.class, tags={ "server group", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = ServerList.class),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 404, message = "Server group not found") })
    @RequestMapping(value = "/api/v1/group/{name}/servers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ServerList> apiV1GroupNameServersGet(@ApiParam(value = "Name of the server group",required=true) @PathVariable("name") String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"servers\" : [ {    \"ip-address\" : \"10.0.0.11\",    \"online-players\" : 4,    \"name\" : \"lobby-1\",    \"group\" : \"lobby\",    \"status\" : \"starting\"  }, {    \"ip-address\" : \"10.0.0.11\",    \"online-players\" : 4,    \"name\" : \"lobby-1\",    \"group\" : \"lobby\",    \"status\" : \"starting\"  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Create a new server group", nickname = "apiV1GroupPost", notes = "", response = ServerGroup.class, tags={ "server group", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful operation", response = ServerGroup.class),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 409, message = "Server group already exists") })
    @RequestMapping(value = "/api/v1/group",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ServerGroup> apiV1GroupPost(@ApiParam(value = "Create a new server group" ,required=true )  @Valid @RequestBody ServerGroup serverGroup) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"template\" : \"lobby-template\",  \"name\" : \"lobby\",  \"ports\" : [ {    \"target-port\" : 25565,    \"protocol\" : \"tcp\",    \"publish-mode\" : \"ingress\",    \"published-port\" : 25565,    \"name\" : \"minecraft\"  }, {    \"target-port\" : 25565,    \"protocol\" : \"tcp\",    \"publish-mode\" : \"ingress\",    \"published-port\" : 25565,    \"name\" : \"minecraft\"  } ],  \"max-players-per-server\" : 20}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get all servers", nickname = "apiV1ServerGet", notes = "", response = Server.class, responseContainer = "List", tags={ "server", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Server.class, responseContainer = "List") })
    @RequestMapping(value = "/api/v1/server",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Server>> apiV1ServerGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ip-address\" : \"10.0.0.11\",  \"online-players\" : 4,  \"name\" : \"lobby-1\",  \"group\" : \"lobby\",  \"status\" : \"starting\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Delete an existing server", nickname = "apiV1ServerNameDelete", notes = "", tags={ "server", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 404, message = "Server not found") })
    @RequestMapping(value = "/api/v1/server/{name}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> apiV1ServerNameDelete(@ApiParam(value = "Name of the server",required=true) @PathVariable("name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get the server", nickname = "apiV1ServerNameGet", notes = "", response = Server.class, tags={ "server", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Server.class),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 404, message = "Server not found") })
    @RequestMapping(value = "/api/v1/server/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Server> apiV1ServerNameGet(@ApiParam(value = "Name of the server",required=true) @PathVariable("name") String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ip-address\" : \"10.0.0.11\",  \"online-players\" : 4,  \"name\" : \"lobby-1\",  \"group\" : \"lobby\",  \"status\" : \"starting\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Create a new server", nickname = "apiV1ServerPost", notes = "", response = Server.class, tags={ "server", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful operation", response = Server.class),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 409, message = "Server already exists") })
    @RequestMapping(value = "/api/v1/server",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Server> apiV1ServerPost(@ApiParam(value = ""  )  @Valid @RequestBody InlineObject inlineObject) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ip-address\" : \"10.0.0.11\",  \"online-players\" : 4,  \"name\" : \"lobby-1\",  \"group\" : \"lobby\",  \"status\" : \"starting\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get all templates", nickname = "apiV1TemplateGet", notes = "", response = Template.class, responseContainer = "List", tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Template.class, responseContainer = "List") })
    @RequestMapping(value = "/api/v1/template",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Template>> apiV1TemplateGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",  \"size\" : 0,  \"name\" : \"lobby-template\",  \"command\" : \"java -jar server.jar\",  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Delete an existing template", nickname = "apiV1TemplateNameDelete", notes = "", tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 403, message = "Template in use"),
        @ApiResponse(code = 404, message = "Template not found") })
    @RequestMapping(value = "/api/v1/template/{name}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> apiV1TemplateNameDelete(@ApiParam(value = "Name of the template",required=true) @PathVariable("name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Downloads the template", nickname = "apiV1TemplateNameDownloadGet", notes = "", response = Resource.class, tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Resource.class),
        @ApiResponse(code = 204, message = "Empty template"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 404, message = "Template not found") })
    @RequestMapping(value = "/api/v1/template/{name}/download",
        produces = { "application/octet-stream" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Resource> apiV1TemplateNameDownloadGet(@ApiParam(value = "Name of the template",required=true) @PathVariable("name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get the template", nickname = "apiV1TemplateNameGet", notes = "", response = Template.class, tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Template.class),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 404, message = "Template not found") })
    @RequestMapping(value = "/api/v1/template/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Template> apiV1TemplateNameGet(@ApiParam(value = "Name of the template",required=true) @PathVariable("name") String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",  \"size\" : 0,  \"name\" : \"lobby-template\",  \"command\" : \"java -jar server.jar\",  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Create a new template", nickname = "apiV1TemplatePost", notes = "", response = Template.class, tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful operation", response = Template.class),
        @ApiResponse(code = 409, message = "Template already exists") })
    @RequestMapping(value = "/api/v1/template",
        produces = { "application/json" }, 
        consumes = { "application/octet-stream" },
        method = RequestMethod.POST)
    default ResponseEntity<Template> apiV1TemplatePost(@NotNull @ApiParam(value = "Name of the template", required = true) @Valid @RequestParam(value = "name", required = true) String name,@ApiParam(value = "The tar binary of the template folder" ,required=true )  @Valid @RequestBody Resource body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",  \"size\" : 0,  \"name\" : \"lobby-template\",  \"command\" : \"java -jar server.jar\",  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Update the files of the template", nickname = "apiV1TemplatePut", notes = "", response = Template.class, tags={ "template", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Template.class) })
    @RequestMapping(value = "/api/v1/template",
        produces = { "application/json" }, 
        consumes = { "application/octet-stream" },
        method = RequestMethod.PUT)
    default ResponseEntity<Template> apiV1TemplatePut(@NotNull @ApiParam(value = "Name of the template", required = true) @Valid @RequestParam(value = "name", required = true) String name,@ApiParam(value = "The tar binary of the template folder" ,required=true )  @Valid @RequestBody Resource body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",  \"size\" : 0,  \"name\" : \"lobby-template\",  \"command\" : \"java -jar server.jar\",  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
