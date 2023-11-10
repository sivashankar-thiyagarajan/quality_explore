/*
 create a java class to represent Pet object with id, name, status, category
 create Category as inner class
 */

public class Pet {
    private int id;
    private String name;
    private String status;
    private Category category;

    public Pet(int id, String name, String status, Category category) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.category = category;
    }

    public Pet() {
    }

    /*
    Create category as inner class
     */

    public static class Category{

        private int id;
        private String name;

        public Category(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Category() {
        }

    }
}
