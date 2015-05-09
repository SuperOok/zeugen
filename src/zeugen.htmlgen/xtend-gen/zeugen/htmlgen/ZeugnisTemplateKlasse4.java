package zeugen.htmlgen;

import org.eclipse.xtend2.lib.StringConcatenation;
import zeugen.configuration.Schule;

@SuppressWarnings("all")
public class ZeugnisTemplateKlasse4 {
  public CharSequence generateHtml(final Schule config) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!doctype html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link rel=\"stylesheet\" href=\"style.css\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("<!--- Platz für CSS -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>Zeugnis Klassenstufe 4</title>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<h1>");
    String _name = config.getName();
    _builder.append(_name, "  ");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<h2>Zeugnis</h2>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    return _builder;
  }
}
