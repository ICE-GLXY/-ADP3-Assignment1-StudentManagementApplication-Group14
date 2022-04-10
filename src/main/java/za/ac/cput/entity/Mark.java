package za.ac.cput.entity;
/*
 * Author Lelihle Gazi - (214258041)
 * Mark.java
 * Created entity for Mark class
 * 08-04-2022
 */

public class Mark {

    private String markID;
    private String markDescription;
    private String markStudentId;
    private String markSubjectId;
    private float markResult;


    private Mark(Builder builder){
        this.markID = builder.markID;
        this.markDescription = builder.markDescription;
        this.markStudentId = builder.markStudentID;
        this.markSubjectId = builder.markSubjectId;
        this.markResult = builder.markResult;

    }

    public String getMarkID() {
        return markID;
    }

    public void setMarkID(String markID) {
        this.markID = markID;
    }

    public String getMarkDescription() {
        return markDescription;
    }

    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    public String getMarkStudentId() {
        return markStudentId;
    }

    public void setMarkStudentId(String markStudentId) {
        this.markStudentId = markStudentId;
    }

    public String getMarkSubjectId() {
        return markSubjectId;
    }

    public void setMarkSubjectId(String markSubjectId) {
        this.markSubjectId = markSubjectId;
    }

    public float getMarkResult() {
        return markResult;
    }

    public void setMarkResult(float markResult) {
        this.markResult = markResult;
    }


    @Override
    public String toString() {
        return "Mark{" +
                "markID='" + markID + '\'' +
                ", markDescription='" + markDescription + '\'' +
                ", markStudentId='" + markStudentId + '\'' +
                ", markSubjectId='" + markSubjectId + '\'' +
                ", markResult=" + markResult +
                '}';
    }

    public static class Builder {
        private String markID;
        private String markDescription;
        private String markStudentID;
        private String markSubjectId;
        private float markResult;

        public Builder setMarkID(String markID) {
            this.markID = markID;
            return  this;
        }

        public Builder setMarkDescription(String markDescription) {
            this.markDescription = markDescription;
            return this;
        }

        public Builder setMarkStudentID(String markStudentID) {
            this.markStudentID = markStudentID;
            return this;
        }

        public Builder setMarkSubjectId(String markSubjectId) {
            this.markSubjectId = markSubjectId;
            return this;
        }

        public Builder setMarkResult(float markResult) {
            this.markResult = markResult;
            return this;
        }

        public Builder copy(Mark mark){
            this.markID = mark.markID;
            this.markDescription = mark.markDescription;
            this.markStudentID = mark.markStudentId;
            this.markSubjectId = mark.markSubjectId;
            this.markResult = mark.markResult;
            return this;
        }

        public Mark build(){
            return new Mark(this);
        }
    }
}

