package com.example.recyclerviewapplication;

public class Film
{
    private String _name;
    private int _resourceFlag;

    public Film(String name, int flag)
    {
        _name = name;
        _resourceFlag = flag;
    }

    public int getResourceFlag() {
        return _resourceFlag;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setResourceFlag(int resourceFlag) {
        _resourceFlag = resourceFlag;
    }
}

