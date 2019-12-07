
$(document).ready(function () {

    $('#archersDataTable').DataTable(
    {
        dom: 'Blfrtip',
        buttons: [

            {
                extend: 'pdfHtml5',
                orientation: 'landscape',
                pageSize: 'LEGAL',
                message: 'List Of Archers',
                title:"Archery Scoring App"+new Date(),
                filename: function(){
                    var d = new Date();
                    return 'Archery Scoring App:' +d;
                },
                	
            }, 
        	 'copyHtml5',
             'excelHtml5',
             'csvHtml5',
             'print'
        
	    ]

    });

});
/*
$(document).ready(function() {
    $('#archersDataTable').DataTable();
} );
*/
