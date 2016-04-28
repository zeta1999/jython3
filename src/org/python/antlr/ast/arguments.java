// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.AST;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.base.excepthandler;
import org.python.antlr.base.expr;
import org.python.antlr.base.mod;
import org.python.antlr.base.slice;
import org.python.antlr.base.stmt;
import org.python.core.ArgParser;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyStringMap;
import org.python.core.PyType;
import org.python.core.Visitproc;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.arguments", base = AST.class)
public class arguments extends PythonTree {
    public static final PyType TYPE = PyType.fromClass(arguments.class);
    private java.util.List<expr> args;
    public java.util.List<expr> getInternalArgs() {
        return args;
    }
    @ExposedGet(name = "args")
    public PyObject getArgs() {
        return new AstList(args, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "args")
    public void setArgs(PyObject args) {
        this.args = AstAdapters.py2exprList(args);
    }

    private String vararg;
    public String getInternalVararg() {
        return vararg;
    }
    @ExposedGet(name = "vararg")
    public PyObject getVararg() {
        if (vararg == null) return Py.None;
        return new PyString(vararg);
    }
    @ExposedSet(name = "vararg")
    public void setVararg(PyObject vararg) {
        this.vararg = AstAdapters.py2identifier(vararg);
    }

    private java.util.List<String> kwonlyargs;
    public java.util.List<String> getInternalKwonlyargs() {
        return kwonlyargs;
    }
    @ExposedGet(name = "kwonlyargs")
    public PyObject getKwonlyargs() {
        return new AstList(kwonlyargs, AstAdapters.identifierAdapter);
    }
    @ExposedSet(name = "kwonlyargs")
    public void setKwonlyargs(PyObject kwonlyargs) {
        this.kwonlyargs = AstAdapters.py2identifierList(kwonlyargs);
    }

    private java.util.List<expr> kw_defaults;
    public java.util.List<expr> getInternalKw_defaults() {
        return kw_defaults;
    }
    @ExposedGet(name = "kw_defaults")
    public PyObject getKw_defaults() {
        return new AstList(kw_defaults, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "kw_defaults")
    public void setKw_defaults(PyObject kw_defaults) {
        this.kw_defaults = AstAdapters.py2exprList(kw_defaults);
    }

    private String kwarg;
    public String getInternalKwarg() {
        return kwarg;
    }
    @ExposedGet(name = "kwarg")
    public PyObject getKwarg() {
        if (kwarg == null) return Py.None;
        return new PyString(kwarg);
    }
    @ExposedSet(name = "kwarg")
    public void setKwarg(PyObject kwarg) {
        this.kwarg = AstAdapters.py2identifier(kwarg);
    }

    private java.util.List<expr> defaults;
    public java.util.List<expr> getInternalDefaults() {
        return defaults;
    }
    @ExposedGet(name = "defaults")
    public PyObject getDefaults() {
        return new AstList(defaults, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "defaults")
    public void setDefaults(PyObject defaults) {
        this.defaults = AstAdapters.py2exprList(defaults);
    }


    private final static PyString[] fields =
    new PyString[] {new PyString("args"), new PyString("vararg"), new PyString("kwonlyargs"), new
                     PyString("kw_defaults"), new PyString("kwarg"), new PyString("defaults")};
    @ExposedGet(name = "_fields")
    public PyString[] get_fields() { return fields; }

    private final static PyString[] attributes = new PyString[0];
    @ExposedGet(name = "_attributes")
    public PyString[] get_attributes() { return attributes; }

    public arguments(PyType subType) {
        super(subType);
    }
    public arguments() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void arguments___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("arguments", args, keywords, new String[]
            {"args", "vararg", "kwonlyargs", "kw_defaults", "kwarg", "defaults"}, 6, true);
        setArgs(ap.getPyObject(0, Py.None));
        setVararg(ap.getPyObject(1, Py.None));
        setKwonlyargs(ap.getPyObject(2, Py.None));
        setKw_defaults(ap.getPyObject(3, Py.None));
        setKwarg(ap.getPyObject(4, Py.None));
        setDefaults(ap.getPyObject(5, Py.None));
    }

    public arguments(PyObject args, PyObject vararg, PyObject kwonlyargs, PyObject kw_defaults,
    PyObject kwarg, PyObject defaults) {
        setArgs(args);
        setVararg(vararg);
        setKwonlyargs(kwonlyargs);
        setKw_defaults(kw_defaults);
        setKwarg(kwarg);
        setDefaults(defaults);
    }

    public arguments(Token token, java.util.List<expr> args, String vararg, java.util.List<String>
    kwonlyargs, java.util.List<expr> kw_defaults, String kwarg, java.util.List<expr> defaults) {
        super(token);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<expr>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg;
        this.kwonlyargs = kwonlyargs;
        this.kw_defaults = kw_defaults;
        if (kw_defaults == null) {
            this.kw_defaults = new ArrayList<expr>();
        }
        for(PythonTree t : this.kw_defaults) {
            addChild(t);
        }
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<expr>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }

    public arguments(Integer ttype, Token token, java.util.List<expr> args, String vararg,
    java.util.List<String> kwonlyargs, java.util.List<expr> kw_defaults, String kwarg,
    java.util.List<expr> defaults) {
        super(ttype, token);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<expr>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg;
        this.kwonlyargs = kwonlyargs;
        this.kw_defaults = kw_defaults;
        if (kw_defaults == null) {
            this.kw_defaults = new ArrayList<expr>();
        }
        for(PythonTree t : this.kw_defaults) {
            addChild(t);
        }
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<expr>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }

    public arguments(PythonTree tree, java.util.List<expr> args, String vararg,
    java.util.List<String> kwonlyargs, java.util.List<expr> kw_defaults, String kwarg,
    java.util.List<expr> defaults) {
        super(tree);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<expr>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg;
        this.kwonlyargs = kwonlyargs;
        this.kw_defaults = kw_defaults;
        if (kw_defaults == null) {
            this.kw_defaults = new ArrayList<expr>();
        }
        for(PythonTree t : this.kw_defaults) {
            addChild(t);
        }
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<expr>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "arguments";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("arguments(");
        sb.append("args=");
        sb.append(dumpThis(args));
        sb.append(",");
        sb.append("vararg=");
        sb.append(dumpThis(vararg));
        sb.append(",");
        sb.append("kwonlyargs=");
        sb.append(dumpThis(kwonlyargs));
        sb.append(",");
        sb.append("kw_defaults=");
        sb.append(dumpThis(kw_defaults));
        sb.append(",");
        sb.append("kwarg=");
        sb.append(dumpThis(kwarg));
        sb.append(",");
        sb.append("defaults=");
        sb.append(dumpThis(defaults));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (args != null) {
            for (PythonTree t : args) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (kw_defaults != null) {
            for (PythonTree t : kw_defaults) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (defaults != null) {
            for (PythonTree t : defaults) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    public PyObject __dict__;

    @Override
    public PyObject fastGetDict() {
        ensureDict();
        return __dict__;
    }

    @ExposedGet(name = "__dict__")
    public PyObject getDict() {
        return fastGetDict();
    }

    private void ensureDict() {
        if (__dict__ == null) {
            __dict__ = new PyStringMap();
        }
    }

    // Support for indexer below

    private Name varargName;
    public Name getInternalVarargName() {
        return varargName;
    }
    private Name kwargName;
    public Name getInternalKwargName() {
        return kwargName;
    }
    // XXX: vararg and kwarg are deliberately moved to the end of the
    // method signature to avoid clashes with the (Token, List<expr>,
    // String, String, List<expr>) version of the constructor.
    public arguments(Token token, java.util.List<expr> args, Name vararg, Name kwarg,
            java.util.List<expr> defaults) {
        super(token);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<expr>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg == null ? null : vararg.getText();
        this.varargName = vararg;
        this.kwarg = kwarg == null ? null : kwarg.getText();
        this.kwargName = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<expr>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }
    // End indexer support


    /* Traverseproc implementation */
    @Override
    public int traverse(Visitproc visit, Object arg) {
        int retVal = super.traverse(visit, arg);
        if (retVal != 0) {
            return retVal;
        }
        if (args != null) {
            for (PyObject ob: args) {
                if (ob != null) {
                    retVal = visit.visit(ob, arg);
                    if (retVal != 0) {
                        return retVal;
                    }
                }
            }
        }
        if (defaults != null) {
            for (PyObject ob: defaults) {
                if (ob != null) {
                    retVal = visit.visit(ob, arg);
                    if (retVal != 0) {
                        return retVal;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public boolean refersDirectlyTo(PyObject ob) {
        if (ob == null) {
            return false;
        } else if (args != null && args.contains(ob)) {
            return true;
        } else if (defaults != null && defaults.contains(ob)) {
            return true;
        } else {
            return super.refersDirectlyTo(ob);
        }
    }
}
