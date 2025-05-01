.class public Lcom/coremedia/iso/boxes/threegpp26244/a;
.super Lcom/googlecode/mp4parser/c;
.source "LocationInformationBox.java"


# static fields
.field public static final A:Ljava/lang/String; = "loci"

.field private static final synthetic B:Lorg/aspectj/lang/c$b;

.field private static final synthetic C:Lorg/aspectj/lang/c$b;

.field private static final synthetic D:Lorg/aspectj/lang/c$b;

.field private static final synthetic E:Lorg/aspectj/lang/c$b;

.field private static final synthetic F:Lorg/aspectj/lang/c$b;

.field private static final synthetic G:Lorg/aspectj/lang/c$b;

.field private static final synthetic H:Lorg/aspectj/lang/c$b;

.field private static final synthetic I:Lorg/aspectj/lang/c$b;

.field private static final synthetic J:Lorg/aspectj/lang/c$b;

.field private static final synthetic K:Lorg/aspectj/lang/c$b;

.field private static final synthetic L:Lorg/aspectj/lang/c$b;

.field private static final synthetic M:Lorg/aspectj/lang/c$b;

.field private static final synthetic N:Lorg/aspectj/lang/c$b;

.field private static final synthetic O:Lorg/aspectj/lang/c$b;

.field private static final synthetic P:Lorg/aspectj/lang/c$b;

.field private static final synthetic Q:Lorg/aspectj/lang/c$b;


# instance fields
.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:I

.field private v:D

.field private w:D

.field private x:D

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/coremedia/iso/boxes/threegpp26244/a;->s()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "loci"

    .line 1
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/c;-><init>(Ljava/lang/String;)V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->t:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->y:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->z:Ljava/lang/String;

    return-void
.end method

.method private static synthetic s()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/e;

    const-class v0, Lcom/coremedia/iso/boxes/threegpp26244/a;

    const-string v1, "LocationInformationBox.java"

    invoke-direct {v8, v1, v0}, Lorg/aspectj/runtime/reflect/e;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v1, "1"

    const-string v2, "getLanguage"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.lang.String"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const-string v9, "method-execution"

    const/16 v1, 0x1e

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->B:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setLanguage"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, "java.lang.String"

    const-string v5, "language"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x22

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->C:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getAltitude"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "double"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x46

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->L:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setAltitude"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, "double"

    const-string v5, "altitude"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x4a

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->M:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getAstronomicalBody"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.lang.String"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x4e

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->N:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setAstronomicalBody"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, "java.lang.String"

    const-string v5, "astronomicalBody"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x52

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->O:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getAdditionalNotes"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.lang.String"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x56

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->P:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setAdditionalNotes"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, "java.lang.String"

    const-string v5, "additionalNotes"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x5a

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->Q:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getName"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.lang.String"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x26

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->D:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setName"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, "java.lang.String"

    const-string v5, "name"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x2a

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->E:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getRole"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->F:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setRole"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, "int"

    const-string v5, "role"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x32

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->G:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getLongitude"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "double"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x36

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->H:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setLongitude"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, "double"

    const-string v5, "longitude"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->I:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getLatitude"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "double"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x3e

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->J:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setLatitude"

    const-string v3, "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox"

    const-string v4, "double"

    const-string v5, "latitude"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x42

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->K:Lorg/aspectj/lang/c$b;

    return-void
.end method


# virtual methods
.method public A()D
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->H:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-wide v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->v:D

    return-wide v0
.end method

.method public B()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->D:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->t:Ljava/lang/String;

    return-object v0
.end method

.method public C()I
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->F:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->u:I

    return v0
.end method

.method public D(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->Q:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->z:Ljava/lang/String;

    return-void
.end method

.method public E(D)V
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->M:Lorg/aspectj/lang/c$b;

    invoke-static {p1, p2}, Lorg/aspectj/runtime/internal/e;->g(D)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-wide p1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->x:D

    return-void
.end method

.method public F(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->O:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->y:Ljava/lang/String;

    return-void
.end method

.method public G(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->C:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->s:Ljava/lang/String;

    return-void
.end method

.method public H(D)V
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->K:Lorg/aspectj/lang/c$b;

    invoke-static {p1, p2}, Lorg/aspectj/runtime/internal/e;->g(D)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-wide p1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->w:D

    return-void
.end method

.method public I(D)V
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->I:Lorg/aspectj/lang/c$b;

    invoke-static {p1, p2}, Lorg/aspectj/runtime/internal/e;->g(D)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-wide p1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->v:D

    return-void
.end method

.method public J(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->E:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->t:Ljava/lang/String;

    return-void
.end method

.method public K(I)V
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->G:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->u:I

    return-void
.end method

.method public b(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/c;->t(Ljava/nio/ByteBuffer;)J

    .line 2
    invoke-static {p1}, Lcom/coremedia/iso/g;->f(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->s:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lcom/coremedia/iso/g;->g(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->t:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->u:I

    .line 5
    invoke-static {p1}, Lcom/coremedia/iso/g;->d(Ljava/nio/ByteBuffer;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->v:D

    .line 6
    invoke-static {p1}, Lcom/coremedia/iso/g;->d(Ljava/nio/ByteBuffer;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->w:D

    .line 7
    invoke-static {p1}, Lcom/coremedia/iso/g;->d(Ljava/nio/ByteBuffer;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->x:D

    .line 8
    invoke-static {p1}, Lcom/coremedia/iso/g;->g(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->y:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/coremedia/iso/g;->g(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->z:Ljava/lang/String;

    return-void
.end method

.method protected c(Ljava/nio/ByteBuffer;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/c;->u(Ljava/nio/ByteBuffer;)V

    .line 2
    iget-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->s:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->d(Ljava/nio/ByteBuffer;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->t:Ljava/lang/String;

    invoke-static {v0}, Lcom/coremedia/iso/l;->b(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 5
    iget v1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->u:I

    invoke-static {p1, v1}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 6
    iget-wide v1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->v:D

    invoke-static {p1, v1, v2}, Lcom/coremedia/iso/i;->b(Ljava/nio/ByteBuffer;D)V

    .line 7
    iget-wide v1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->w:D

    invoke-static {p1, v1, v2}, Lcom/coremedia/iso/i;->b(Ljava/nio/ByteBuffer;D)V

    .line 8
    iget-wide v1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->x:D

    invoke-static {p1, v1, v2}, Lcom/coremedia/iso/i;->b(Ljava/nio/ByteBuffer;D)V

    .line 9
    iget-object v1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->y:Ljava/lang/String;

    invoke-static {v1}, Lcom/coremedia/iso/l;->b(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 10
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 11
    iget-object v1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->z:Ljava/lang/String;

    invoke-static {v1}, Lcom/coremedia/iso/l;->b(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 12
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    return-void
.end method

.method protected e()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->t:Ljava/lang/String;

    invoke-static {v0}, Lcom/coremedia/iso/l;->b(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, 0x16

    iget-object v1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->y:Ljava/lang/String;

    invoke-static {v1}, Lcom/coremedia/iso/l;->b(Ljava/lang/String;)[B

    move-result-object v1

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->z:Ljava/lang/String;

    invoke-static {v1}, Lcom/coremedia/iso/l;->b(Ljava/lang/String;)[B

    move-result-object v1

    array-length v1, v1

    add-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public v()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->P:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->z:Ljava/lang/String;

    return-object v0
.end method

.method public w()D
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->L:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-wide v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->x:D

    return-wide v0
.end method

.method public x()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->N:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->y:Ljava/lang/String;

    return-object v0
.end method

.method public y()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->B:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->s:Ljava/lang/String;

    return-object v0
.end method

.method public z()D
    .locals 2

    sget-object v0, Lcom/coremedia/iso/boxes/threegpp26244/a;->J:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-wide v0, p0, Lcom/coremedia/iso/boxes/threegpp26244/a;->w:D

    return-wide v0
.end method
