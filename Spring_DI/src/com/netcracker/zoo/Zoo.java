package com.netcracker.zoo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zoo {
    List<IAnimal> all;
    Map<IAnimal,String>  nutrition;
    Set<IAnimal> type;

    public Zoo() {
    }

    public Zoo(List<IAnimal> all, Map<IAnimal, String> nutrition, Set<IAnimal> type) {
        this.all = all;
        this.nutrition = nutrition;
        this.type = type;
    }

    @Override
    public String toString() {
        return all.toString();
    }

    public void setAll(List all) {
        this.all = all;
    }

    public List getAll() {
        return all;
    }

    public void setNutrition(Map nutrition) {
        this.nutrition = nutrition;
    }

    public Map getNutrition() {
        return nutrition;
    }

    public void setType(Set type) {
        this.type = type;
    }

    public Set getType() {
        return type;
    }
}
