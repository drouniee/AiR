package ru.mirea.lab7.num7;

class Magazine implements Printable {
    private String name;

    public Magazine(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void print(){
        System.out.println("Журнал: " + name);
    }

    public static void printMagazine(Printable[] printables) {
        for (Printable p: printables){
            if (p instanceof Magazine){
                p.print();
            }
        }
    }

}