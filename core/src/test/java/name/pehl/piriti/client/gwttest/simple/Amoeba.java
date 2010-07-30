package name.pehl.piriti.client.gwttest.simple;

import name.pehl.piriti.client.json.JsonField;
import name.pehl.piriti.client.json.JsonReader;
import name.pehl.piriti.client.json.JsonWriter;
import name.pehl.piriti.client.xml.XmlField;
import name.pehl.piriti.client.xml.XmlReader;
import name.pehl.piriti.client.xml.XmlWriter;

import com.google.gwt.core.client.GWT;

/**
 * @author $LastChangedBy:$
 * @version $LastChangedRevision:$
 */

public class Amoeba
{
    // --------------------------------------------------- json reader / writer

    public interface AmoebaJsonWriter extends JsonWriter<Amoeba>
    {
    }

    public static final AmoebaJsonWriter JSON_WRITER = GWT.create(AmoebaJsonWriter.class);

    public interface AmoebaJsonReader extends JsonReader<Amoeba>
    {
    }

    public static final AmoebaJsonReader JSON_READER = GWT.create(AmoebaJsonReader.class);

    // ---------------------------------------------------- xml reader / writer

    public interface AmoebaXmlReader extends XmlReader<Amoeba>
    {
    }

    public static final AmoebaXmlReader XML_READER = GWT.create(AmoebaXmlReader.class);

    public interface AmoebaXmlWriter extends XmlWriter<Amoeba>
    {
    }

    public static final AmoebaXmlWriter XML_WRITER = GWT.create(AmoebaXmlWriter.class);

    // ------------------------------------------------------------------- data

    @JsonField
    @XmlField
    String name;


    public Amoeba()
    {
        this.name = "blueprint";
    }


    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        Amoeba other = (Amoeba) obj;
        if (name == null)
        {
            if (other.name != null)
            {
                return false;
            }
        }
        else if (!name.equals(other.name))
        {
            return false;
        }
        return true;
    }


    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Amoeba [name=").append(name).append("]");
        return builder.toString();
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }
}
