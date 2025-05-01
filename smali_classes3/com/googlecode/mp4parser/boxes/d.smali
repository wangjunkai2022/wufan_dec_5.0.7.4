.class public Lcom/googlecode/mp4parser/boxes/d;
.super Lcom/googlecode/mp4parser/a;
.source "DTSSpecificBox.java"


# static fields
.field private static final synthetic A1:Lorg/aspectj/lang/c$b; = null

.field private static final synthetic B1:Lorg/aspectj/lang/c$b; = null

.field private static final synthetic C1:Lorg/aspectj/lang/c$b; = null

.field private static final synthetic D1:Lorg/aspectj/lang/c$b; = null

.field public static final E:Ljava/lang/String; = "ddts"

.field private static final synthetic E1:Lorg/aspectj/lang/c$b;

.field private static final synthetic F:Lorg/aspectj/lang/c$b;

.field private static final synthetic F1:Lorg/aspectj/lang/c$b;

.field private static final synthetic G:Lorg/aspectj/lang/c$b;

.field private static final synthetic G1:Lorg/aspectj/lang/c$b;

.field private static final synthetic H:Lorg/aspectj/lang/c$b;

.field private static final synthetic H1:Lorg/aspectj/lang/c$b;

.field private static final synthetic I:Lorg/aspectj/lang/c$b;

.field private static final synthetic J:Lorg/aspectj/lang/c$b;

.field private static final synthetic K:Lorg/aspectj/lang/c$b;

.field private static final synthetic L:Lorg/aspectj/lang/c$b;

.field private static final synthetic M:Lorg/aspectj/lang/c$b;

.field private static final synthetic N:Lorg/aspectj/lang/c$b;

.field private static final synthetic O:Lorg/aspectj/lang/c$b;

.field private static final synthetic P:Lorg/aspectj/lang/c$b;

.field private static final synthetic Q:Lorg/aspectj/lang/c$b;

.field private static final synthetic R:Lorg/aspectj/lang/c$b;

.field private static final synthetic S:Lorg/aspectj/lang/c$b;

.field private static final synthetic T:Lorg/aspectj/lang/c$b;

.field private static final synthetic U:Lorg/aspectj/lang/c$b;

.field private static final synthetic V:Lorg/aspectj/lang/c$b;

.field private static final synthetic W:Lorg/aspectj/lang/c$b;

.field private static final synthetic X:Lorg/aspectj/lang/c$b;

.field private static final synthetic Y:Lorg/aspectj/lang/c$b;

.field private static final synthetic Z:Lorg/aspectj/lang/c$b;

.field private static final synthetic p0:Lorg/aspectj/lang/c$b;

.field private static final synthetic p1:Lorg/aspectj/lang/c$b;

.field private static final synthetic v1:Lorg/aspectj/lang/c$b;


# instance fields
.field A:I

.field B:I

.field C:I

.field D:I

.field o:J

.field p:J

.field q:J

.field r:I

.field s:I

.field t:I

.field u:I

.field v:I

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/boxes/d;->s()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "ddts"

    .line 1
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/a;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic s()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/e;

    const-class v0, Lcom/googlecode/mp4parser/boxes/d;

    const-string v1, "DTSSpecificBox.java"

    invoke-direct {v8, v1, v0}, Lorg/aspectj/runtime/reflect/e;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v1, "1"

    const-string v2, "getAvgBitRate"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "long"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const-string v9, "method-execution"

    const/16 v1, 0x59

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->F:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setAvgBitRate"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "long"

    const-string v5, "avgBitRate"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x5d

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->G:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getStreamConstruction"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x81

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->P:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setStreamConstruction"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string/jumbo v5, "streamConstruction"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x85

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->Q:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getCoreLFEPresent"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x89

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->R:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setCoreLFEPresent"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "coreLFEPresent"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x8d

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->S:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getCoreLayout"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x91

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->T:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setCoreLayout"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "coreLayout"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x95

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->U:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getCoreSize"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x99

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->V:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setCoreSize"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "coreSize"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x9d

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->W:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getStereoDownmix"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xa1

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->X:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setStereoDownmix"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string/jumbo v5, "stereoDownmix"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xa5

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->Y:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getDTSSamplingFrequency"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "long"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x61

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->H:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getRepresentationType"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xa9

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->Z:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setRepresentationType"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "representationType"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xad

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->p0:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getChannelLayout"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xb1

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->p1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setChannelLayout"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "channelLayout"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xb5

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->v1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getMultiAssetFlag"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xb9

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->A1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setMultiAssetFlag"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "multiAssetFlag"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xbd

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->B1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getLBRDurationMod"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xc1

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->C1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setLBRDurationMod"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "LBRDurationMod"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xc5

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->D1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getReserved"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xc9

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->E1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setReserved"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "reserved"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xcd

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->F1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setDTSSamplingFrequency"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "long"

    const-string v5, "DTSSamplingFrequency"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x65

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->I:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getReservedBoxPresent"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xd1

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->G1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setReservedBoxPresent"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "reservedBoxPresent"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0xd5

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->H1:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getMaxBitRate"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "long"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x69

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->J:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setMaxBitRate"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "long"

    const-string v5, "maxBitRate"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x6d

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->K:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getPcmSampleDepth"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x71

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->L:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setPcmSampleDepth"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "pcmSampleDepth"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x75

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->M:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "getFrameDuration"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x79

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->N:Lorg/aspectj/lang/c$b;

    const-string v1, "1"

    const-string v2, "setFrameDuration"

    const-string v3, "com.googlecode.mp4parser.boxes.DTSSpecificBox"

    const-string v4, "int"

    const-string v5, "frameDuration"

    const-string v6, ""

    const-string/jumbo v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/e;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/t;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/e;->H(Ljava/lang/String;Lorg/aspectj/lang/e;I)Lorg/aspectj/lang/c$b;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/d;->O:Lorg/aspectj/lang/c$b;

    return-void
.end method


# virtual methods
.method public A()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->N:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->s:I

    return v0
.end method

.method public B()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->C1:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->B:I

    return v0
.end method

.method public C()J
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->J:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/d;->p:J

    return-wide v0
.end method

.method public D()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->A1:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->A:I

    return v0
.end method

.method public E()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->L:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->r:I

    return v0
.end method

.method public F()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->Z:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->y:I

    return v0
.end method

.method public G()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->E1:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->D:I

    return v0
.end method

.method public H()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->G1:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->C:I

    return v0
.end method

.method public I()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->X:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->x:I

    return v0
.end method

.method public J()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->P:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->t:I

    return v0
.end method

.method public K(J)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->G:Lorg/aspectj/lang/c$b;

    invoke-static {p1, p2}, Lorg/aspectj/runtime/internal/e;->m(J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-wide p1, p0, Lcom/googlecode/mp4parser/boxes/d;->q:J

    return-void
.end method

.method public L(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->v1:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->z:I

    return-void
.end method

.method public M(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->S:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->u:I

    return-void
.end method

.method public N(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->U:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->v:I

    return-void
.end method

.method public O(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->W:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->w:I

    return-void
.end method

.method public P(J)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->I:Lorg/aspectj/lang/c$b;

    invoke-static {p1, p2}, Lorg/aspectj/runtime/internal/e;->m(J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-wide p1, p0, Lcom/googlecode/mp4parser/boxes/d;->o:J

    return-void
.end method

.method public Q(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->O:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->s:I

    return-void
.end method

.method public R(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->D1:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->B:I

    return-void
.end method

.method public S(J)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->K:Lorg/aspectj/lang/c$b;

    invoke-static {p1, p2}, Lorg/aspectj/runtime/internal/e;->m(J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput-wide p1, p0, Lcom/googlecode/mp4parser/boxes/d;->p:J

    return-void
.end method

.method public T(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->B1:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->A:I

    return-void
.end method

.method public U(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->M:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->r:I

    return-void
.end method

.method public V(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->p0:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->y:I

    return-void
.end method

.method public W(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->F1:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->D:I

    return-void
.end method

.method public X(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->H1:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->C:I

    return-void
.end method

.method public Y(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->Y:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->x:I

    return-void
.end method

.method public Z(I)V
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->Q:Lorg/aspectj/lang/c$b;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/e;->k(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/aspectj/runtime/reflect/e;->w(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->t:I

    return-void
.end method

.method public b(Ljava/nio/ByteBuffer;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/coremedia/iso/g;->l(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/boxes/d;->o:J

    .line 2
    invoke-static {p1}, Lcom/coremedia/iso/g;->l(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/boxes/d;->p:J

    .line 3
    invoke-static {p1}, Lcom/coremedia/iso/g;->l(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/boxes/d;->q:J

    .line 4
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/d;->r:I

    .line 5
    new-instance v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;

    invoke-direct {v0, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;-><init>(Ljava/nio/ByteBuffer;)V

    const/4 p1, 0x2

    .line 6
    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result p1

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->s:I

    const/4 p1, 0x5

    .line 7
    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/d;->t:I

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/boxes/d;->u:I

    const/4 v2, 0x6

    .line 9
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/boxes/d;->v:I

    const/16 v2, 0xe

    .line 10
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/boxes/d;->w:I

    .line 11
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/boxes/d;->x:I

    const/4 v2, 0x3

    .line 12
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/boxes/d;->y:I

    const/16 v2, 0x10

    .line 13
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/boxes/d;->z:I

    .line 14
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/boxes/d;->A:I

    .line 15
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/boxes/d;->B:I

    .line 16
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/d;->C:I

    .line 17
    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result p1

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/d;->D:I

    return-void
.end method

.method protected c(Ljava/nio/ByteBuffer;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/d;->o:J

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/i;->i(Ljava/nio/ByteBuffer;J)V

    .line 2
    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/d;->p:J

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/i;->i(Ljava/nio/ByteBuffer;J)V

    .line 3
    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/d;->q:J

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/i;->i(Ljava/nio/ByteBuffer;J)V

    .line 4
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->r:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 5
    new-instance v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;

    invoke-direct {v0, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;-><init>(Ljava/nio/ByteBuffer;)V

    .line 6
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->s:I

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 7
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->t:I

    const/4 v1, 0x5

    invoke-virtual {v0, p1, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 8
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->u:I

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 9
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->v:I

    const/4 v3, 0x6

    invoke-virtual {v0, p1, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 10
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->w:I

    const/16 v3, 0xe

    invoke-virtual {v0, p1, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 11
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->x:I

    invoke-virtual {v0, p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 12
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->y:I

    const/4 v3, 0x3

    invoke-virtual {v0, p1, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 13
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->z:I

    const/16 v3, 0x10

    invoke-virtual {v0, p1, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 14
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->A:I

    invoke-virtual {v0, p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 15
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->B:I

    invoke-virtual {v0, p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 16
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->C:I

    invoke-virtual {v0, p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    .line 17
    iget p1, p0, Lcom/googlecode/mp4parser/boxes/d;->D:I

    invoke-virtual {v0, p1, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/d;->a(II)V

    return-void
.end method

.method protected e()J
    .locals 2

    const-wide/16 v0, 0x14

    return-wide v0
.end method

.method public t()J
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->F:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/d;->q:J

    return-wide v0
.end method

.method public u()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->p1:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->z:I

    return v0
.end method

.method public v()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->R:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->u:I

    return v0
.end method

.method public w()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->T:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->v:I

    return v0
.end method

.method public x()I
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->V:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/d;->w:I

    return v0
.end method

.method public y()J
    .locals 2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/d;->H:Lorg/aspectj/lang/c$b;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/e;->v(Lorg/aspectj/lang/c$b;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/c;

    move-result-object v0

    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/j;->b()Lcom/googlecode/mp4parser/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/j;->c(Lorg/aspectj/lang/c;)V

    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/d;->o:J

    return-wide v0
.end method

.method public z()[I
    .locals 11
    .annotation runtime Lcom/googlecode/mp4parser/annotations/DoNotParseDetail;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/boxes/d;->u()I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_0

    const/4 v1, 0x1

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_0
    and-int/lit8 v6, v0, 0x2

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    add-int/lit8 v1, v1, 0x2

    or-int/lit8 v5, v5, 0x1

    or-int/2addr v5, v7

    :cond_1
    and-int/lit8 v6, v0, 0x4

    const/16 v8, 0x20

    if-ne v6, v2, :cond_2

    add-int/lit8 v1, v1, 0x2

    or-int/lit8 v2, v5, 0x10

    or-int/lit8 v5, v2, 0x20

    :cond_2
    and-int/lit8 v2, v0, 0x8

    const/16 v6, 0x8

    if-ne v2, v6, :cond_3

    add-int/lit8 v1, v1, 0x1

    or-int/lit8 v5, v5, 0x8

    :cond_3
    and-int/lit8 v2, v0, 0x10

    const/16 v6, 0x10

    if-ne v2, v6, :cond_4

    add-int/lit8 v1, v1, 0x1

    or-int/lit16 v5, v5, 0x100

    :cond_4
    and-int/lit8 v2, v0, 0x20

    const/16 v6, 0x4000

    if-ne v2, v8, :cond_5

    add-int/lit8 v1, v1, 0x2

    or-int/lit16 v2, v5, 0x1000

    or-int/lit16 v5, v2, 0x4000

    :cond_5
    and-int/lit8 v2, v0, 0x40

    const/16 v9, 0x40

    if-ne v2, v9, :cond_6

    add-int/lit8 v1, v1, 0x2

    or-int/lit8 v2, v5, 0x10

    or-int/lit8 v5, v2, 0x20

    :cond_6
    and-int/lit16 v2, v0, 0x80

    const/16 v9, 0x80

    if-ne v2, v9, :cond_7

    add-int/lit8 v1, v1, 0x1

    or-int/lit16 v5, v5, 0x2000

    :cond_7
    and-int/lit16 v2, v0, 0x100

    const/16 v10, 0x100

    if-ne v2, v10, :cond_8

    add-int/lit8 v1, v1, 0x1

    or-int/lit16 v5, v5, 0x800

    :cond_8
    and-int/lit16 v2, v0, 0x200

    const/16 v10, 0x200

    if-ne v2, v10, :cond_9

    add-int/lit8 v1, v1, 0x2

    or-int/lit8 v2, v5, 0x40

    or-int/lit16 v5, v2, 0x80

    :cond_9
    and-int/lit16 v2, v0, 0x400

    const/16 v9, 0x400

    if-ne v2, v9, :cond_a

    add-int/lit8 v1, v1, 0x2

    or-int/lit16 v2, v5, 0x200

    or-int/lit16 v5, v2, 0x400

    :cond_a
    and-int/lit16 v2, v0, 0x800

    const/16 v9, 0x800

    if-ne v2, v9, :cond_b

    add-int/lit8 v1, v1, 0x2

    or-int/lit8 v2, v5, 0x10

    or-int/lit8 v5, v2, 0x20

    :cond_b
    and-int/lit16 v2, v0, 0x1000

    const/16 v9, 0x1000

    if-ne v2, v9, :cond_c

    add-int/lit8 v1, v1, 0x1

    or-int/lit8 v5, v5, 0x8

    :cond_c
    and-int/lit16 v2, v0, 0x2000

    const/16 v9, 0x2000

    if-ne v2, v9, :cond_d

    add-int/lit8 v1, v1, 0x2

    or-int/lit8 v2, v5, 0x10

    or-int/lit8 v5, v2, 0x20

    :cond_d
    and-int/lit16 v2, v0, 0x4000

    const/high16 v8, 0x10000

    if-ne v2, v6, :cond_e

    add-int/lit8 v1, v1, 0x1

    or-int/2addr v5, v8

    :cond_e
    const v2, 0x8000

    and-int v6, v0, v2

    const/high16 v9, 0x20000

    if-ne v6, v2, :cond_f

    add-int/lit8 v1, v1, 0x2

    or-int/2addr v2, v5

    or-int v5, v2, v9

    :cond_f
    and-int v2, v0, v8

    if-ne v2, v8, :cond_10

    add-int/lit8 v1, v1, 0x1

    :cond_10
    and-int/2addr v0, v9

    if-ne v0, v9, :cond_11

    add-int/lit8 v1, v1, 0x2

    :cond_11
    new-array v0, v7, [I

    aput v1, v0, v3

    aput v5, v0, v4

    return-object v0
.end method
