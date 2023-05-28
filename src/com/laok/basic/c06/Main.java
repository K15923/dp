package com.laok.basic.c06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author k 2023/5/25 16:01
 */
public class Main {

    public static void main(String[] args) {
        List<Department> allDepts = new ArrayList<>();
        String deptTree = "1/2/";
        allDepts.add(new Department(7, 0, "水浒传", deptTree));
        allDepts.add(new Department(12, 7, "研发部", "1/2/3/4/5/"));
        Iterator<Department> iterator = allDepts.iterator();
        while (iterator.hasNext()) {
            Department next = iterator.next();
            String[] split = next.getDeptTree().split("/");
            String a = next.getDeptTree();
            for (int i = 0; i < split.length; i++) {
                String st = "a" + i;
                a = a.replace(split[i], st);
            }
            next.setDeptTree(a);
        }
        System.out.println(allDepts);


    }


}

class Department {
    int id;
    int parentId;
    String name;
    String deptTree;

    public Department(int id, int parentId, String name, String deptTree) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.deptTree = deptTree;
    }

    public String getDeptTree() {
        return deptTree;
    }

    public void setDeptTree(String deptTree) {
        this.deptTree = deptTree;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", parentId=" + parentId + ", name='" + name + '\'' + ", deptTree='" +
               deptTree + '\'' + '}';
    }
}
