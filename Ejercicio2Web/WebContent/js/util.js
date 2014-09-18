// FIXME: Mejorar esta función!!

var formatDate = function(unixTimestamp) {
	if (!Number(unixTimestamp)) // Si ya es una fecha válida
		return unixTimestamp;
	
    var dt = new Date(unixTimestamp);

    var day = dt.getDay() + 10;
    var month = dt.getMonth() + 1;
    var year = dt.getFullYear();

    // the above dt.get...() functions return a single digit
    // so I prepend the zero here when needed
    if (day < 10) 
     day = '0' + day;

    if (month < 10) 
     month = '0' + month;

    return year + "-" + month + "-" + day;
}