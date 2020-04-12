package vgrupper.coming.searchcitycriteria;

import javax.validation.constraints.NotBlank;

public class SearchCriteria {

    @NotBlank(message = "city can't empty!")
    String cityname;

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
}
