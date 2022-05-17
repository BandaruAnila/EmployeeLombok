
package ai.jobiak.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor  
@AllArgsConstructor  
@ToString 

public class Employee  
{  
	
	@Setter
	@Getter
private Integer sttudentId;  

	@Setter
	@Getter
private String studentName;  

	@Setter
	@Getter
private  String studentClass; 

	@Setter
	@Getter
private  String studentEmailId;  
}  