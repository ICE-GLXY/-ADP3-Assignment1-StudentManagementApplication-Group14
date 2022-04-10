package za.ac.cput.entity;


/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
   Grade.java
   April 2022
   Resources entity
 */

public class Resources {
    private String resources_id;
    private String textbooks;
    private String exercises;
    private String slideshows;

    private Resources (Builder builder){
        this.resources_id = builder.resources_id;
        this.textbooks = builder.textbooks;
        this.exercises = builder.exercises;
        this.slideshows = builder.slideshows;
    }

    public String getResources_id() {
        return resources_id;
    }

    public void setResources_id(String resources_id) {
        this.resources_id = resources_id;
    }

    public String getTextbooks() {
        return textbooks;
    }

    public void setTextbooks(String textbooks) {
        this.textbooks = textbooks;
    }

    public String getExercises() {
        return exercises;
    }

    public void setExercises(String exercises) {
        this.exercises = exercises;
    }

    public String getSlideshows() {
        return slideshows;
    }

    public void setSlideshows(String slideshows) {
        this.slideshows = slideshows;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "resources_id" + resources_id +
                "textbooks" + textbooks +
                "exercises" + exercises +
                ", slideshows='" + slideshows + '\'' +'}';
    }

    public static class Builder{
        private String resources_id;
        private String textbooks;
        private String exercises;
        private String slideshows;

        public Builder setResources_id(String resources_id){
            this.resources_id = resources_id;
            return this;
        }

        public Builder setTextbooks(String textbooks){
            this.textbooks = textbooks;
            return this;
        }

        public Builder setExercises(String exercises){
            this.exercises = exercises;
            return this;
        }

        public Builder setSlideshows(String slideshows){
            this.slideshows = slideshows;
            return this;
        }

        public Builder copy (Resources resources){
            this.resources_id = resources.resources_id;
            this.textbooks = resources.textbooks;
            this.exercises = resources.exercises;
            this.slideshows = resources.slideshows;
            return this;
        }

        public Resources build() {return new Resources(this);}
    }
}

