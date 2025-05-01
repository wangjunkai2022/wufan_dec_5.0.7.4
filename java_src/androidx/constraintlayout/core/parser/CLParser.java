package androidx.constraintlayout.core.parser;
/* loaded from: classes.dex */
public class CLParser {
    static boolean DEBUG;
    private boolean hasComment = false;
    private int lineNumber;
    private String mContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.core.parser.CLParser$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;

        static {
            int[] iArr = new int[TYPE.values().length];
            $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = iArr;
            try {
                iArr[TYPE.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i4, TYPE type, boolean z4, char[] cArr) {
        CLElement allocate;
        if (DEBUG) {
            System.out.println("CREATE " + type + " at " + cArr[i4]);
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[type.ordinal()]) {
            case 1:
                allocate = CLObject.allocate(cArr);
                i4++;
                break;
            case 2:
                allocate = CLArray.allocate(cArr);
                i4++;
                break;
            case 3:
                allocate = CLString.allocate(cArr);
                break;
            case 4:
                allocate = CLNumber.allocate(cArr);
                break;
            case 5:
                allocate = CLKey.allocate(cArr);
                break;
            case 6:
                allocate = CLToken.allocate(cArr);
                break;
            default:
                allocate = null;
                break;
        }
        if (allocate == null) {
            return null;
        }
        allocate.setLine(this.lineNumber);
        if (z4) {
            allocate.setStart(i4);
        }
        if (cLElement instanceof CLContainer) {
            allocate.setContainer((CLContainer) cLElement);
        }
        return allocate;
    }

    private CLElement getNextJsonElement(int i4, char c5, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c5 == '\t' || c5 == '\n' || c5 == '\r' || c5 == ' ') {
            return cLElement;
        }
        if (c5 == '\"' || c5 == '\'') {
            if (cLElement instanceof CLObject) {
                return createElement(cLElement, i4, TYPE.KEY, true, cArr);
            }
            return createElement(cLElement, i4, TYPE.STRING, true, cArr);
        } else if (c5 != '[') {
            if (c5 != ']') {
                if (c5 == '{') {
                    return createElement(cLElement, i4, TYPE.OBJECT, true, cArr);
                }
                if (c5 != '}') {
                    switch (c5) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return createElement(cLElement, i4, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            return cLElement;
                        case '/':
                            int i5 = i4 + 1;
                            if (i5 >= cArr.length || cArr[i5] != '/') {
                                return cLElement;
                            }
                            this.hasComment = true;
                            return cLElement;
                        default:
                            if ((cLElement instanceof CLContainer) && !(cLElement instanceof CLObject)) {
                                CLElement createElement = createElement(cLElement, i4, TYPE.TOKEN, true, cArr);
                                CLToken cLToken = (CLToken) createElement;
                                if (cLToken.validate(c5, i4)) {
                                    return createElement;
                                }
                                throw new CLParsingException("incorrect token <" + c5 + "> at line " + this.lineNumber, cLToken);
                            }
                            return createElement(cLElement, i4, TYPE.KEY, true, cArr);
                    }
                }
            }
            cLElement.setEnd(i4 - 1);
            CLElement container = cLElement.getContainer();
            container.setEnd(i4);
            return container;
        } else {
            return createElement(cLElement, i4, TYPE.ARRAY, true, cArr);
        }
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    public CLObject parse() throws CLParsingException {
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i4 = 1;
        this.lineNumber = 1;
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            char c5 = charArray[i5];
            if (c5 == '{') {
                break;
            }
            if (c5 == '\n') {
                this.lineNumber++;
            }
            i5++;
        }
        if (i5 != -1) {
            CLObject allocate = CLObject.allocate(charArray);
            allocate.setLine(this.lineNumber);
            allocate.setStart(i5);
            int i6 = i5 + 1;
            CLObject cLObject = allocate;
            while (i6 < length) {
                char c6 = charArray[i6];
                if (c6 == '\n') {
                    this.lineNumber += i4;
                }
                if (this.hasComment) {
                    if (c6 == '\n') {
                        this.hasComment = z4;
                    } else {
                        continue;
                        i6++;
                        i4 = 1;
                        z4 = false;
                    }
                }
                if (cLObject == null) {
                    break;
                }
                if (cLObject.isDone()) {
                    cLObject = getNextJsonElement(i6, c6, cLObject, charArray);
                } else if (cLObject instanceof CLObject) {
                    if (c6 == '}') {
                        cLObject.setEnd(i6 - 1);
                    } else {
                        cLObject = getNextJsonElement(i6, c6, cLObject, charArray);
                    }
                } else if (!(cLObject instanceof CLArray)) {
                    boolean z5 = cLObject instanceof CLString;
                    if (z5) {
                        long j4 = cLObject.start;
                        if (charArray[(int) j4] == c6) {
                            cLObject.setStart(j4 + 1);
                            cLObject.setEnd(i6 - 1);
                        }
                    } else {
                        if (cLObject instanceof CLToken) {
                            CLToken cLToken = (CLToken) cLObject;
                            if (!cLToken.validate(c6, i6)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.lineNumber, cLToken);
                            }
                        }
                        if ((cLObject instanceof CLKey) || z5) {
                            long j5 = cLObject.start;
                            char c7 = charArray[(int) j5];
                            if ((c7 == '\'' || c7 == '\"') && c7 == c6) {
                                cLObject.setStart(j5 + 1);
                                cLObject.setEnd(i6 - 1);
                            }
                        }
                        if (!cLObject.isDone() && (c6 == '}' || c6 == ']' || c6 == ',' || c6 == ' ' || c6 == '\t' || c6 == '\r' || c6 == '\n' || c6 == ':')) {
                            long j6 = i6 - 1;
                            cLObject.setEnd(j6);
                            if (c6 == '}' || c6 == ']') {
                                cLObject = cLObject.getContainer();
                                cLObject.setEnd(j6);
                                if (cLObject instanceof CLKey) {
                                    cLObject = cLObject.getContainer();
                                    cLObject.setEnd(j6);
                                }
                            }
                        }
                    }
                } else if (c6 == ']') {
                    cLObject.setEnd(i6 - 1);
                } else {
                    cLObject = getNextJsonElement(i6, c6, cLObject, charArray);
                }
                if (cLObject.isDone() && (!(cLObject instanceof CLKey) || ((CLKey) cLObject).mElements.size() > 0)) {
                    cLObject = cLObject.getContainer();
                }
                i6++;
                i4 = 1;
                z4 = false;
            }
            while (cLObject != null && !cLObject.isDone()) {
                if (cLObject instanceof CLString) {
                    cLObject.setStart(((int) cLObject.start) + 1);
                }
                cLObject.setEnd(length - 1);
                cLObject = cLObject.getContainer();
            }
            if (DEBUG) {
                System.out.println("Root: " + allocate.toJSON());
            }
            return allocate;
        }
        throw new CLParsingException("invalid json content", null);
    }
}
