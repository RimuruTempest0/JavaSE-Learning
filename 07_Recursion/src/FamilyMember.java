import java.util.*;
public class FamilyMember {

    public String name;
    List<FamilyMember> children;
    public FamilyMember(String name) 
    {
        this.name = name;
        children = new ArrayList<FamilyMember>();
    }
    public void addChildren(FamilyMember f)
    {
        children.add(f);
    }

    public List<FamilyMember> getAllParents()
    {
        List<FamilyMember> parents = new ArrayList<FamilyMember>();
        if(children.size() > 0) {
            parents.add(this);
            for(int i = 0; i < children.size(); i++) {
            parents.addAll(children.get(i).getAllParents());
            }
        }
        return parents;
    }

    public void printAll()
    {
        System.out.println(this.name);
        if(children.size() > 0)
        {
            for(FamilyMember child : children)
            {
                child.printAll();
            }
        }
    }

    public void printParent()
    {
        
        if(children.size() > 0)
        {
            System.out.println(this.name);
            for(FamilyMember child : children)
            {
                child.printParent();
            }
        }
    }

    public void printLeaf()
    {
        
        if(children.size() > 0)
        {
            for(FamilyMember child : children)
            {
                child.printLeaf();
            }
        }else
            System.out.println(this.name);
    }

    public static void main(String[] args) {
        FamilyMember Liz = new FamilyMember("Liz");
        FamilyMember Sue = new FamilyMember("Sue");
        FamilyMember Joe = new FamilyMember("Joe");
        FamilyMember Max = new FamilyMember("Max");
        FamilyMember Ali = new FamilyMember("Ali");
        FamilyMember Fin = new FamilyMember("Fin");

        Liz.addChildren(Sue);
        Liz.addChildren(Joe);

        Sue.addChildren(Max);
        Joe.addChildren(Ali);
        Joe.addChildren(Fin);

        // Liz.printAll();
        // Liz.printParent();
        Liz.printLeaf();
    }
        
}
