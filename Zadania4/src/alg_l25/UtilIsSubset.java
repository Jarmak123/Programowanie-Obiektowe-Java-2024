package alg_l25;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class UtilIsSubset {
    public static <E> boolean isSubset(TreeSet<E> potentialSubset, TreeSet<E> superset){
        for(E i: potentialSubset){
            if(!superset.contains(i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeSet<Integer> potential = new TreeSet<>();
        potential.add(1);
        potential.add(2);
        potential.add(5);

        TreeSet<Integer> superset = new TreeSet<>();
        superset.add(1);
        superset.add(2);
        superset.add(3);
        superset.add(4);

        System.out.println(isSubset(potential,superset));

    }
}
