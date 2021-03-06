

package codigo;
import static codigo.Tokens.*;



class Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\11\1\13\2\0\1\7\22\0\1\7\1\47\1\12\2\0"+
    "\1\45\2\0\1\61\1\62\1\41\1\43\1\7\1\44\1\6\1\40"+
    "\1\5\11\4\1\57\1\60\1\50\1\42\1\51\2\0\1\52\2\2"+
    "\1\54\11\2\1\53\1\55\1\37\1\2\1\56\10\2\1\63\1\0"+
    "\1\64\1\46\1\3\1\0\1\21\1\25\1\23\1\24\1\14\1\31"+
    "\1\36\1\33\1\27\2\1\1\22\1\32\1\15\1\20\1\35\1\1"+
    "\1\17\1\10\1\16\1\26\1\30\1\1\1\34\2\1\1\65\1\0"+
    "\1\66\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\2\2\4\1\5\2\6"+
    "\1\7\1\10\1\11\14\2\1\3\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\1\1\21\1\22\2\3"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\2\2\3\1\0\1\6\1\33\1\0\1\34\23\2"+
    "\1\3\1\6\1\0\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\3\1\43\2\0\1\44\1\4\30\2\1\3"+
    "\1\0\1\45\2\0\1\4\1\0\1\44\1\0\1\46"+
    "\5\2\1\47\1\50\24\2\1\3\1\6\7\2\1\51"+
    "\1\2\1\52\7\2\1\53\2\2\1\54\4\2\1\3"+
    "\1\2\1\55\4\2\1\56\16\2\1\3\10\2\1\57"+
    "\2\2\1\60\1\2\1\61\5\2\1\3\1\62\1\63"+
    "\1\64\1\65\3\2\1\66\3\2\1\67\2\2\1\70"+
    "\1\71\1\3\5\2\1\72\2\2\1\73\1\2\1\74"+
    "\1\2\1\75\1\2\1\76\1\2\1\77\1\100\1\101"+
    "\1\102";

  private static int [] zzUnpackAction() {
    int [] result = new int[256];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\67"+
    "\0\u0181\0\u01b8\0\67\0\u01ef\0\67\0\u0226\0\u025d\0\u0294"+
    "\0\u02cb\0\u0302\0\u0339\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c"+
    "\0\u0483\0\u04ba\0\u04f1\0\67\0\u0528\0\u055f\0\u0596\0\67"+
    "\0\67\0\u05cd\0\u0604\0\u063b\0\u0672\0\u06a9\0\67\0\67"+
    "\0\67\0\67\0\67\0\67\0\67\0\67\0\u06e0\0\u0717"+
    "\0\u074e\0\u0785\0\u07bc\0\u07f3\0\u01ef\0\u01ef\0\u082a\0\u0861"+
    "\0\u0898\0\u08cf\0\u0906\0\u093d\0\u0974\0\u09ab\0\u09e2\0\u0a19"+
    "\0\u0a50\0\u0a87\0\u0abe\0\u0af5\0\u0b2c\0\u0b63\0\u0b9a\0\u0bd1"+
    "\0\u0c08\0\u0c3f\0\u0c76\0\u0cad\0\67\0\67\0\67\0\67"+
    "\0\67\0\67\0\u0ce4\0\245\0\u0d1b\0\u0d52\0\u0d89\0\u0dc0"+
    "\0\u0df7\0\u0e2e\0\u0e65\0\u0e9c\0\u0ed3\0\u0f0a\0\u0f41\0\u0f78"+
    "\0\u0faf\0\u0fe6\0\u101d\0\u1054\0\u108b\0\u10c2\0\u10f9\0\u1130"+
    "\0\u1167\0\u119e\0\u11d5\0\u120c\0\u1243\0\u127a\0\u12b1\0\u12e8"+
    "\0\u131f\0\u1356\0\245\0\u138d\0\u13c4\0\u13fb\0\u0d89\0\u1432"+
    "\0\u1432\0\156\0\u1469\0\u14a0\0\u14d7\0\u150e\0\u1545\0\156"+
    "\0\156\0\u157c\0\u15b3\0\u15ea\0\u1621\0\u1658\0\u168f\0\u16c6"+
    "\0\u16fd\0\u1734\0\u176b\0\u17a2\0\u17d9\0\u1810\0\u1847\0\u187e"+
    "\0\u18b5\0\u18ec\0\u1923\0\u195a\0\u1991\0\u19c8\0\u0cad\0\u19ff"+
    "\0\u1a36\0\u1a6d\0\u1aa4\0\u1adb\0\u1b12\0\u1b49\0\156\0\u1b80"+
    "\0\156\0\u1bb7\0\u1bee\0\u1c25\0\u1c5c\0\u1c93\0\u1cca\0\u1d01"+
    "\0\156\0\u1d38\0\u1d6f\0\156\0\u1da6\0\u1ddd\0\u1e14\0\u1e4b"+
    "\0\u1e82\0\u1eb9\0\156\0\u1ef0\0\u1f27\0\u1f5e\0\u1f95\0\156"+
    "\0\u1fcc\0\u2003\0\u203a\0\u2071\0\u20a8\0\u20df\0\u2116\0\u214d"+
    "\0\u2184\0\u21bb\0\u21f2\0\u2229\0\u2260\0\u2297\0\u22ce\0\u2305"+
    "\0\u233c\0\u2373\0\u23aa\0\u23e1\0\u2418\0\u244f\0\u2486\0\156"+
    "\0\u24bd\0\u24f4\0\156\0\u252b\0\156\0\u2562\0\u2599\0\u25d0"+
    "\0\u2607\0\u263e\0\u2675\0\156\0\156\0\156\0\156\0\u26ac"+
    "\0\u26e3\0\u271a\0\156\0\u2751\0\u2788\0\u27bf\0\156\0\u27f6"+
    "\0\u282d\0\156\0\156\0\u2864\0\u289b\0\u28d2\0\u2909\0\u2940"+
    "\0\u2977\0\156\0\u29ae\0\u29e5\0\u0717\0\u2a1c\0\156\0\u2a53"+
    "\0\156\0\u2a8a\0\156\0\u2ac1\0\156\0\156\0\156\0\156";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[256];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\3\1\20"+
    "\3\3\1\21\1\22\1\23\1\3\1\24\1\25\1\26"+
    "\1\27\1\30\1\3\1\31\1\3\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\2\4\1\46\1\4\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\70\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\23\3\31\0\1\60\2\4"+
    "\2\61\2\0\1\60\3\0\23\60\1\4\12\0\5\4"+
    "\11\0\1\3\1\4\1\5\2\57\2\0\1\3\3\0"+
    "\23\3\1\4\12\0\5\4\14\0\2\6\1\62\66\0"+
    "\1\62\67\0\2\11\57\0\1\3\1\0\1\3\2\57"+
    "\1\0\1\11\1\63\3\0\13\3\1\64\7\3\30\0"+
    "\12\65\1\66\1\0\53\65\1\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\67\3\0\1\3\1\70\4\3\1\71"+
    "\11\3\1\72\2\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\12\3\1\73\10\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\1\74\22\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\4\3\1\75\1\76\1\77\14\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\1\100\22\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\4\3"+
    "\1\101\16\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\1\3\1\102\21\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\1\103\22\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\5\3"+
    "\1\104\15\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\1\105\12\3\1\106\7\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\5\3\1\107"+
    "\15\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\3\3\1\110\6\3\1\111\10\3\31\0\1\60"+
    "\2\4\2\61\2\0\1\60\3\0\3\60\1\112\17\60"+
    "\1\4\12\0\5\4\50\0\1\113\1\114\67\0\1\115"+
    "\67\0\1\116\67\0\1\117\64\0\1\120\66\0\1\121"+
    "\66\0\1\122\25\0\1\60\2\4\2\61\2\0\1\60"+
    "\3\0\23\60\1\4\12\0\1\4\1\123\3\4\11\0"+
    "\1\60\2\4\2\61\2\0\1\60\3\0\23\60\1\4"+
    "\12\0\4\4\1\124\11\0\1\3\1\0\1\3\2\57"+
    "\1\125\1\0\1\3\3\0\23\3\31\0\1\60\1\0"+
    "\1\60\2\61\2\0\1\60\3\0\23\60\31\0\1\60"+
    "\1\0\1\60\2\61\1\126\1\0\1\60\3\0\23\60"+
    "\34\0\1\127\1\130\62\0\1\3\1\0\1\3\2\57"+
    "\1\0\1\11\1\63\3\0\23\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\1\3\1\131\21\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\7\3\1\132\13\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\2\3\1\133\20\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\13\3\1\134"+
    "\7\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\2\3\1\135\20\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\6\3\1\136\14\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\5\3"+
    "\1\137\15\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\1\3\1\140\21\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\10\3\1\141\12\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\5\3\1\142\15\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\143\3\0\7\3\1\144\4\3\1\145\6\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\6\3\1\146\14\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\147\3\0\7\3\1\150\13\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\3\3\1\151"+
    "\17\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\6\3\1\152\14\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\2\3\1\153\20\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\1\154"+
    "\22\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\7\3\1\155\13\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\4\3\1\156\6\3\1\157"+
    "\7\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\11\3\1\160\11\3\31\0\1\60\1\0\1\60"+
    "\2\61\2\0\1\60\3\0\13\60\1\161\7\60\30\0"+
    "\13\113\1\0\53\113\13\114\1\0\25\114\1\162\25\114"+
    "\1\0\1\60\2\4\2\61\2\0\1\60\3\0\23\60"+
    "\1\4\12\0\2\4\1\163\2\4\14\0\1\164\1\3"+
    "\65\0\1\165\1\60\65\0\1\166\1\167\65\0\1\170"+
    "\2\171\61\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\4\3\1\172\16\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\3\3\1\173\17\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\1\174"+
    "\3\3\1\175\16\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\16\3\1\176\4\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\13\3\1\177"+
    "\7\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\4\3\1\200\16\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\6\3\1\201\14\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\202\3\0\23\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\1\203\22\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\204\3\0\23\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\2\3\1\205\5\3\1\206\12\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\3\3\1\207\17\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\4\3\1\210\16\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\1\211\22\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\2\3\1\212\20\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\3\3\1\213\2\3\1\214\14\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\10\3\1\215\12\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\216\3\0\23\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\4\3\1\217\16\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\1\3"+
    "\1\220\21\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\1\221\22\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\2\3\1\222\16\3\1\223"+
    "\1\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\14\3\1\224\6\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\6\3\1\225\14\3\31\0"+
    "\1\60\1\0\1\60\2\61\2\0\1\60\3\0\1\60"+
    "\1\226\21\60\30\0\13\114\1\0\24\114\1\227\1\162"+
    "\25\114\4\0\1\3\1\164\65\0\1\60\1\165\65\0"+
    "\1\166\1\167\1\171\64\0\1\170\1\171\62\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\13\3\1\230"+
    "\7\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\3\3\1\231\17\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\1\3\1\232\21\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\13\3"+
    "\1\233\7\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\1\234\22\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\2\3\1\235\20\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\1\3"+
    "\1\236\21\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\1\237\22\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\3\3\1\240\17\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\1\241"+
    "\22\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\1\242\22\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\6\3\1\243\14\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\5\3\1\244"+
    "\15\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\5\3\1\245\15\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\1\246\22\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\12\3\1\247"+
    "\10\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\5\3\1\250\15\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\4\3\1\251\16\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\10\3"+
    "\1\252\12\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\2\3\1\253\20\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\3\3\1\254\17\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\1\255\22\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\13\3\1\256\7\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\5\3\1\257\15\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\13\3\1\260\7\3\31\0\1\60\1\0\1\60\2\61"+
    "\2\0\1\60\3\0\7\60\1\261\13\60\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\11\3\1\262"+
    "\11\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\4\3\1\263\16\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\7\3\1\264\13\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\1\3"+
    "\1\265\21\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\1\3\1\266\21\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\3\3\1\267\17\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\5\3\1\270\15\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\12\3\1\271\10\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\16\3\1\272"+
    "\4\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\14\3\1\273\6\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\1\3\1\274\21\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\1\3"+
    "\1\275\21\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\16\3\1\276\4\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\13\3\1\277\7\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\10\3\1\300\12\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\4\3\1\301\16\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\3\3\1\302"+
    "\17\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\22\3\1\303\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\1\304\22\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\10\3\1\305\12\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\7\3\1\306\13\3\31\0\1\60\1\0\1\60\2\61"+
    "\2\0\1\60\3\0\13\60\1\307\7\60\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\13\3\1\310"+
    "\7\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\1\311\22\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\5\3\1\312\15\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\10\3\1\313"+
    "\12\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\12\3\1\314\10\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\7\3\1\315\13\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\1\316"+
    "\22\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\1\317\22\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\4\3\1\320\16\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\7\3\1\321"+
    "\13\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\1\322\22\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\3\3\1\323\17\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\1\324\22\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\325\3\0"+
    "\23\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\5\3\1\326\15\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\13\3\1\327\7\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\10\3"+
    "\1\330\12\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\5\3\1\331\15\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\5\3\1\332\15\3"+
    "\31\0\1\60\1\0\1\60\2\61\2\0\1\60\3\0"+
    "\21\60\1\333\1\60\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\3\3\1\334\17\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\335\3\0\23\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\3\3"+
    "\1\336\17\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\1\337\22\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\7\3\1\340\13\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\2\3"+
    "\1\341\20\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\1\3\1\342\21\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\3\3\1\343\17\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\13\3\1\344\7\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\1\3\1\345\21\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\3\3\1\346"+
    "\17\3\31\0\1\3\1\0\1\3\2\57\2\0\1\347"+
    "\3\0\23\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\10\3\1\350\12\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\5\3\1\351\15\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\352\3\0"+
    "\23\3\31\0\1\3\1\0\1\3\2\57\2\0\1\353"+
    "\3\0\23\3\31\0\1\60\1\0\1\60\2\61\2\0"+
    "\1\60\3\0\5\60\1\354\15\60\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\2\3\1\355\20\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\4\3\1\356\16\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\2\3\1\357\20\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\5\3\1\360"+
    "\15\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\2\3\1\361\20\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\4\3\1\362\16\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\3\3\0\5\3"+
    "\1\363\15\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\10\3\1\364\12\3\31\0\1\60\1\0"+
    "\1\60\2\61\2\0\1\60\3\0\6\60\1\365\14\60"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\4\3\1\366\16\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\3\3\0\3\3\1\367\17\3\31\0\1\3"+
    "\1\0\1\3\2\57\2\0\1\3\3\0\5\3\1\370"+
    "\15\3\31\0\1\3\1\0\1\3\2\57\2\0\1\3"+
    "\3\0\3\3\1\371\17\3\31\0\1\3\1\0\1\3"+
    "\2\57\2\0\1\3\3\0\5\3\1\372\15\3\31\0"+
    "\1\3\1\0\1\3\2\57\2\0\1\373\3\0\23\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\1\374\22\3\31\0\1\3\1\0\1\3\2\57\2\0"+
    "\1\3\3\0\3\3\1\375\17\3\31\0\1\3\1\0"+
    "\1\3\2\57\2\0\1\3\3\0\3\3\1\376\17\3"+
    "\31\0\1\3\1\0\1\3\2\57\2\0\1\3\3\0"+
    "\3\3\1\377\17\3\31\0\1\3\1\0\1\3\2\57"+
    "\2\0\1\u0100\3\0\23\3\30\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11000];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\11\2\1\1\11\1\1\1\11"+
    "\16\1\1\11\3\1\2\11\5\1\10\11\3\1\1\0"+
    "\2\1\1\0\26\1\1\0\6\11\2\1\2\0\33\1"+
    "\1\0\1\1\2\0\1\1\1\0\1\1\1\0\207\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[256];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 144) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 67: break;
        case 34: 
          { lexeme=yytext();return MayorIgual;
          }
        case 68: break;
        case 17: 
          { lexeme=yytext();return Menor;
          }
        case 69: break;
        case 22: 
          { lexeme=yytext();return ParentesisC;
          }
        case 70: break;
        case 55: 
          { lexeme=yytext(); return Mientras;
          }
        case 71: break;
        case 35: 
          { lexeme=yytext();return Or;
          }
        case 72: break;
        case 61: 
          { lexeme=yytext(); return Instanciar;
          }
        case 73: break;
        case 52: 
          { lexeme=yytext(); return Eliminar;
          }
        case 74: break;
        case 57: 
          { lexeme=yytext(); return Publicas;
          }
        case 75: break;
        case 10: 
          { lexeme=yytext();return Division;
          }
        case 76: break;
        case 63: 
          { lexeme=yytext(); return Constructor;
          }
        case 77: break;
        case 54: 
          { lexeme=yytext(); return Devolver;
          }
        case 78: break;
        case 33: 
          { lexeme=yytext();return MenorIgual;
          }
        case 79: break;
        case 44: 
          { lexeme=yytext(); return Hacer;
          }
        case 80: break;
        case 9: 
          { return Linea;
          }
        case 81: break;
        case 43: 
          { lexeme=yytext(); return Falso;
          }
        case 82: break;
        case 28: 
          { lexeme=yytext(); return CadenaT;
          }
        case 83: break;
        case 11: 
          { lexeme=yytext();return Multiplicacion;
          }
        case 84: break;
        case 24: 
          { lexeme=yytext();return CorcheteC;
          }
        case 85: break;
        case 50: 
          { lexeme=yytext(); return Escribir;
          }
        case 86: break;
        case 38: 
          { lexeme=yytext(); return Sino;
          }
        case 87: break;
        case 41: 
          { lexeme=yytext(); return Clase;
          }
        case 88: break;
        case 65: 
          { lexeme=yytext(); return Incrementar;
          }
        case 89: break;
        case 25: 
          { lexeme=yytext();return LlaveA;
          }
        case 90: break;
        case 20: 
          { lexeme=yytext();return PuntoComa;
          }
        case 91: break;
        case 48: 
          { lexeme=yytext(); return Incluir;
          }
        case 92: break;
        case 40: 
          { lexeme=yytext(); return Real;
          }
        case 93: break;
        case 8: 
          { lexeme=yytext(); return Comillas;
          }
        case 94: break;
        case 59: 
          { lexeme=yytext(); return Principal;
          }
        case 95: break;
        case 66: 
          { lexeme=yytext(); return Propiedades;
          }
        case 96: break;
        case 46: 
          { lexeme=yytext(); return Cadena;
          }
        case 97: break;
        case 60: 
          { lexeme=yytext(); return Destructor;
          }
        case 98: break;
        case 62: 
          { lexeme=yytext(); return Protegidas;
          }
        case 99: break;
        case 5: 
          { lexeme=yytext();return Punto;
          }
        case 100: break;
        case 51: 
          { lexeme=yytext(); return Entonces;
          }
        case 101: break;
        case 47: 
          { lexeme=yytext(); return Boleano;
          }
        case 102: break;
        case 36: 
          { lexeme=yytext();return NumReal;
          }
        case 103: break;
        case 4: 
          { lexeme=yytext();return NumEntero;
          }
        case 104: break;
        case 14: 
          { lexeme=yytext();return Resta;
          }
        case 105: break;
        case 56: 
          { lexeme=yytext(); return Privadas;
          }
        case 106: break;
        case 37: 
          { lexeme=yytext();return And;
          }
        case 107: break;
        case 18: 
          { lexeme=yytext();return Mayor;
          }
        case 108: break;
        case 49: 
          { lexeme=yytext(); return Metodos;
          }
        case 109: break;
        case 29: 
          { lexeme=yytext();return Comparador;
          }
        case 110: break;
        case 21: 
          { lexeme=yytext();return ParentesisA;
          }
        case 111: break;
        case 64: 
          { lexeme=yytext(); return Decrementar;
          }
        case 112: break;
        case 3: 
          { lexeme=yytext(); return IdClase;
          }
        case 113: break;
        case 27: 
          { lexeme=yytext(); return Si;
          }
        case 114: break;
        case 58: 
          { lexeme=yytext(); return Verdadero;
          }
        case 115: break;
        case 26: 
          { lexeme=yytext();return LlaveC;
          }
        case 116: break;
        case 1: 
          { return ERROR;
          }
        case 117: break;
        case 31: 
          { lexeme=yytext();return Decremento;
          }
        case 118: break;
        case 45: 
          { lexeme=yytext(); return Entero;
          }
        case 119: break;
        case 32: 
          { lexeme=yytext();return Diferente;
          }
        case 120: break;
        case 13: 
          { lexeme=yytext();return Suma;
          }
        case 121: break;
        case 39: 
          { lexeme=yytext(); return Nulo;
          }
        case 122: break;
        case 30: 
          { lexeme=yytext();return Incremento;
          }
        case 123: break;
        case 16: 
          { lexeme=yytext();return Exponenciacion;
          }
        case 124: break;
        case 6: 
          { /*Ignore*/
          }
        case 125: break;
        case 12: 
          { lexeme=yytext();return Igual;
          }
        case 126: break;
        case 7: 
          { lexeme=yytext(); return Tabulador;
          }
        case 127: break;
        case 23: 
          { lexeme=yytext();return CorcheteA;
          }
        case 128: break;
        case 42: 
          { lexeme=yytext(); return Desde;
          }
        case 129: break;
        case 15: 
          { lexeme=yytext();return Modulo;
          }
        case 130: break;
        case 19: 
          { lexeme=yytext();return DosPuntos;
          }
        case 131: break;
        case 53: 
          { lexeme=yytext(); return Extiende;
          }
        case 132: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
