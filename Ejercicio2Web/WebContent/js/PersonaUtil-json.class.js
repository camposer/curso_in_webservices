const BASE_URL = "/Ejercicio2Servidor/ws/personas";

function PersonaUtil() {
	this.agregar = function(p, callback) {
		var url = BASE_URL;
		
//		var json = "{ nombre: " + p.nombre + ", apellido: " + p.apellido +...
		
		$.ajax(url, {
			type: "post",
			contentType: "application/json",
			data: JSON.stringify(p)
		}).done(function() {
			callback();
		}).fail(function() {
			window.alert("Error al agregar persona");
		});
	};
	
	this.obtenerTodos = function(callback) {
		var url = BASE_URL;
		
		$.ajax(url, {
			type: "get",
			dataType: "json"
		}).done(function(personas) {
			callback(personas);
		}).fail(function() {
			window.alert("Error al buscar las personas");
		});
	};
	
	/**
	 * Busca una persona a partir de un id
	 */
	this.obtener = function(id, callback) {
		var url = BASE_URL + "/" + id;
		
		$.ajax(url, {
			type: "get",
			dataType: "json"
		}).done(function(p) {
			callback(p);
		}).fail(function() {
			window.alert("Error al buscar las personas");
		});
	};

	this.modificar = function(p, callback) {
		var url = BASE_URL + "/" + p.id;
		
		$.ajax(url, {
			type: "put",
			contentType: "application/json",
			data: JSON.stringify(p)
		}).done(function() {
			callback();
		}).fail(function() {
			window.alert("Error al agregar persona");
		});
	};
	

	this.eliminar = function(id, callback) {
		var url = BASE_URL + "/" + id;
		
		$.ajax(url, {
			type: "delete"
		}).done(function(personas) {
			callback();
		}).fail(function() {
			window.alert("Error al buscar las personas");
		});
	};
	
}