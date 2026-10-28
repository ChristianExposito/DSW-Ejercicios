package Christian.Animales.models;
//Atributos
public class Animal {
    private int id;
    private String nombre;
    private int vidaMedia;
    private boolean extinto;
    public Animal(){}
    //Constructor
    public Animal(int id, String nombre, int vidaMedia,boolean extinto) {
        this.id = id;
        this.nombre = nombre;
        this.vidaMedia = vidaMedia;
        this.extinto= extinto;
    }

    //Get y Set
    public int getId() {return id;}
    public void setId(int id){this.id = id;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getVidaMedia(){return vidaMedia;}
    public void setVidaMedia(int vidaMedia){this.vidaMedia=vidaMedia;}
    public boolean getExtinto(){return extinto;}
    public void setExtinto(boolean extinto) { this.extinto = extinto; }
}