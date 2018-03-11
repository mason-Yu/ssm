
   function TimeFormatter(value,row,index){
        var unixTimestamp = new Date(value);  
        return unixTimestamp.toLocaleString();  
	}