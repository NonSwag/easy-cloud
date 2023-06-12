/*
 * MiniCloud API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package server

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// ServerApiController binds http requests to an api service and writes the service results to the http response
type ServerApiController struct {
	service      ServerApiServicer
	errorHandler ErrorHandler
}

// ServerApiOption for how the controller is set up.
type ServerApiOption func(*ServerApiController)

// WithServerApiErrorHandler inject ErrorHandler into controller
func WithServerApiErrorHandler(h ErrorHandler) ServerApiOption {
	return func(c *ServerApiController) {
		c.errorHandler = h
	}
}

// NewServerApiController creates a default api controller
func NewServerApiController(s ServerApiServicer, opts ...ServerApiOption) Router {
	controller := &ServerApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ServerApiController
func (c *ServerApiController) Routes() Routes {
	return Routes{
		{
			"CreateServer",
			strings.ToUpper("Post"),
			"/api/v1/server",
			c.CreateServer,
		},
		{
			"GetServer",
			strings.ToUpper("Get"),
			"/api/v1/server/{name}",
			c.GetServer,
		},
		{
			"GetServers",
			strings.ToUpper("Get"),
			"/api/v1/server",
			c.GetServers,
		},
		{
			"RemoveServer",
			strings.ToUpper("Delete"),
			"/api/v1/server/{name}",
			c.RemoveServer,
		},
		{
			"StartServer",
			strings.ToUpper("Post"),
			"/server/{name}/start",
			c.StartServer,
		},
		{
			"StopServer",
			strings.ToUpper("Post"),
			"/server/{name}/stop",
			c.StopServer,
		},
	}
}

// CreateServer - Create a new server
func (c *ServerApiController) CreateServer(w http.ResponseWriter, r *http.Request) {
	createServerRequestParam := CreateServerRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createServerRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateServerRequestRequired(createServerRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateServer(r.Context(), createServerRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetServer - Get the server
func (c *ServerApiController) GetServer(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	nameParam := params["name"]
	result, err := c.service.GetServer(r.Context(), nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetServers - Get all servers
func (c *ServerApiController) GetServers(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetServers(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// RemoveServer - Delete an existing server
func (c *ServerApiController) RemoveServer(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	nameParam := params["name"]
	result, err := c.service.RemoveServer(r.Context(), nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// StartServer - Start the server
func (c *ServerApiController) StartServer(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	nameParam := params["name"]
	result, err := c.service.StartServer(r.Context(), nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// StopServer - Stop the server
func (c *ServerApiController) StopServer(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	nameParam := params["name"]
	result, err := c.service.StopServer(r.Context(), nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
