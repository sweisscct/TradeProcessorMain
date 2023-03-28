/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tradeprocessormain.validations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sam
 */
public class CompositeValidator implements ValidationInterface {
    private List<ValidationInterface> components = new ArrayList<>();

    public CompositeValidator() {
    }

    public List<ValidationInterface> getComponents() {
        return components;
    }

    public void setComponents(List<ValidationInterface> components) {
        this.components = components;
    }
    
    public void addComponent(ValidationInterface newComponent) {
        components.add(newComponent);
    }
    
    public void removeComponent(ValidationInterface oldComponent) {
        components.remove(oldComponent);
    }
    
    @Override
    public boolean validateData(String[] fields) {
        boolean isValid = true;
        for (ValidationInterface component : components) {
            isValid = isValid && component.validateData(fields);
        }
        return isValid;
    }
    
    
}
