

public class Subject {

    private String nameSubject;
    private Float mark;
    private boolean passed;

    Subject(Subject subject){}

    Subject(String nameSubject){
        this.nameSubject=nameSubject;
    }

    public String getNameSubject(){
        return nameSubject;
    }

     public float getMark(){
         int m;
         m= 2 + (int)(Math.random() * 4);
         mark=(float)m;
        return mark;
     }

    public boolean getPassed(){
        if(this.mark <= 2){
            return false;
        }
        return true;
    }



}
