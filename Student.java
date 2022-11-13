
public  class Student {
 
	private int Matrikelnummer;
	private String Nachname;
	private String Vorname;
	private Double  Note;
	
	public Student(int Matrikelnummer,String Nachname,String Vorname, double Note) {
		
		this.Matrikelnummer = Matrikelnummer ;
		this.Nachname = Nachname;
		this.Vorname = Vorname;
		this.Note = Note;
	
	}
	
	public int gibMatrikelnummer() {
		
		
		return Matrikelnummer;
	}

	public String gibNachname() {
		
		
		return Nachname;
	}
	
	public String gibVorname() {
		
		
		return Vorname;
	}
	
	public Double gibNote() {
		
		
		return Note;
	}
		
	@Override
	
	public String toString() {
		
		
		return + Matrikelnummer + Nachname + Vorname + Note + "\n" ; 
		
		
	}
	

	/*public int  compareTo(Student o) {
		
		double noteDiff = Note - o.gibNote();
		if (noteDiff != 0) {
			
			return noteDiff; 
			
		}
		else if ((noteDiff==0)&& Nachname.equals(o.gibNachname())) {
			
			return Nachname.compareTo(o.gibNachname());
		}
		else {
			
			return Matrikelnummer.compareTo.(o.gibMatrikelnummer());
		} */
		
		
		
	}

	

