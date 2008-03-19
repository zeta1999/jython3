// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Import extends stmtType {
    public aliasType[] names;

    public static final String[] _fields = new String[] {"names"};

    public Import(Token token, aliasType[] names) {
        super(token);
        this.names = names;
        for(int inames=0;inames<names.length;inames++) {
            addChild(names[inames]);
        }
    }

    public Import(PythonTree tree, aliasType[] names) {
        super(tree);
        this.names = names;
        for(int inames=0;inames<names.length;inames++) {
            addChild(names[inames]);
        }
    }

    public String toString() {
        return "Import";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitImport(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (names != null) {
            for (int i = 0; i < names.length; i++) {
                if (names[i] != null)
                    names[i].accept(visitor);
            }
        }
    }

}
