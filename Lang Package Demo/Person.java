class Person{
	public boolean equals(Object obj){
		if(obj instanceof Person){
			Person p = (Person) obj;
			if(name.equals(p.name) && age == p.age){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
}