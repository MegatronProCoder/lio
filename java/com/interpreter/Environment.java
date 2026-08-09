package com.interpreter;

import java.util.HashMap;
import java.util.Map;

class Environment{
    final Environment enclosing;
    private final Map<String, Object> values = new HashMap<>();

    Environment() {
        this.enclosing = null;
    }

    Environment(Environment enclosing) {
        this.enclosing = enclosing;
    }
    
    Object get(Token name){
        if(values.containsKey(name.lexeme)){
            return values.get(name.lexeme);
        }
        if(enclosing != null) {
            //System.out.println("calling enclosing env.");
            return enclosing.get(name);
        }
        throw new RuntimeError(name, "Undeclared variable '" + name.lexeme +"'.");
    }

    void define(String name, Object value){
        values.put(name, value);
    }

    void assign(Token name, Object value){
        if(values.containsKey(name.lexeme)){
            values.put(name.lexeme, value);
            return;
        }
        if(enclosing != null) {
            enclosing.assign(name , value);
            return;
        }
        throw new RuntimeError(name, "Undeclare variable '" + name.lexeme + "'.");
    }

    Object getAt(int distance, String name){
        return ancestor(distance).values.get(name);
    }

    void assignAt(int distance, Token name, Object value){
        ancestor(distance).values.put(name.lexeme, value);
    }
    private Environment ancestor(int distance){
        Environment env = this;
        for(int i = 0; i < distance; i++){
            env = env.enclosing;
        }
        return env;
    }
}