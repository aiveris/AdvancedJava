public class Composition {
    public static void main(String[] args) {

        Owner me = new Owner("Windows", 8, 999, 1);
        me.getMyStatus();
    }
}

class OS{
    String name;
    public OS(String name){
        this.name=name;
    }
    
    public String getStatus(){
        if(name.equals("Android")){return "Cool OS";}
        else if(name.equals("iOS")){return "hmmm... gerai!";}
        else{return "Blogai!";}// missing return statement
    }
}

class Version {
    int version;

    public Version(int version) {
        this.version = version;
    }

    public String getStatus() {
        if (version > 10) {
            return "Great!";
        } else if (version < 10) {
            return "Please Update!";
        } else {
            return "Special Case!";
        }
    }
}

class Battery {
    int power;
    public Battery (int power){
    this.power = power;
    }
    public String getStatus(){
        if (power >1000){
            return "Powerful!";
        }else{
            return "Weak...!";
        }
    }
}
class Processor {
    int speed;
    public Processor (int power){
        this.speed = power;
    }
    public String getStatus(){
        if (speed >2){
            return "Fast!";
        }else{
            return "Slow...!";
        }
    }
}
class Owner{
    OS os;
    Version v;
    Battery bat;
    Processor cpu;

    public Owner(String os, int v, int p, int c){
        this.os= new OS(os);
        this.v = new Version(v);
        this.bat = new Battery(p);
        this.cpu = new Processor(c);
    }

    public void getMyStatus(){
        System.out.println(os.getStatus());
        System.out.println(v.getStatus());
        System.out.println(bat.getStatus());
        System.out.println(cpu.getStatus());
    }
}
