package students;

public enum StudentType {
	Graduate("Graduate"), UnderGraduate("UnderGraduate");
    
    private String name;
    
    StudentType(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public static StudentType fromString(String name){
        if(name != null){
            for(StudentType a: StudentType.values()){
                if(name.equalsIgnoreCase(a.name)){
                    return a;
                }
            }
        }
        return null;
    }
    

}