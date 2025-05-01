.class public final enum Lexternal/org/apache/commons/lang3/JavaVersion;
.super Ljava/lang/Enum;
.source "JavaVersion.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexternal/org/apache/commons/lang3/JavaVersion;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lexternal/org/apache/commons/lang3/JavaVersion;

.field public static final enum JAVA_0_9:Lexternal/org/apache/commons/lang3/JavaVersion;

.field public static final enum JAVA_1_1:Lexternal/org/apache/commons/lang3/JavaVersion;

.field public static final enum JAVA_1_2:Lexternal/org/apache/commons/lang3/JavaVersion;

.field public static final enum JAVA_1_3:Lexternal/org/apache/commons/lang3/JavaVersion;

.field public static final enum JAVA_1_4:Lexternal/org/apache/commons/lang3/JavaVersion;

.field public static final enum JAVA_1_5:Lexternal/org/apache/commons/lang3/JavaVersion;

.field public static final enum JAVA_1_6:Lexternal/org/apache/commons/lang3/JavaVersion;

.field public static final enum JAVA_1_7:Lexternal/org/apache/commons/lang3/JavaVersion;

.field public static final enum JAVA_1_8:Lexternal/org/apache/commons/lang3/JavaVersion;


# instance fields
.field private name:Ljava/lang/String;

.field private value:F


# direct methods
.method private static synthetic $values()[Lexternal/org/apache/commons/lang3/JavaVersion;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 1
    sget-object v1, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_0_9:Lexternal/org/apache/commons/lang3/JavaVersion;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_1:Lexternal/org/apache/commons/lang3/JavaVersion;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_2:Lexternal/org/apache/commons/lang3/JavaVersion;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_3:Lexternal/org/apache/commons/lang3/JavaVersion;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_4:Lexternal/org/apache/commons/lang3/JavaVersion;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_5:Lexternal/org/apache/commons/lang3/JavaVersion;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_6:Lexternal/org/apache/commons/lang3/JavaVersion;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_7:Lexternal/org/apache/commons/lang3/JavaVersion;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_8:Lexternal/org/apache/commons/lang3/JavaVersion;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    const-string v1, "JAVA_0_9"

    const/4 v2, 0x0

    const/high16 v3, 0x3fc00000    # 1.5f

    const-string v4, "0.9"

    invoke-direct {v0, v1, v2, v3, v4}, Lexternal/org/apache/commons/lang3/JavaVersion;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_0_9:Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 2
    new-instance v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    const-string v1, "JAVA_1_1"

    const/4 v2, 0x1

    const v4, 0x3f8ccccd    # 1.1f

    const-string v5, "1.1"

    invoke-direct {v0, v1, v2, v4, v5}, Lexternal/org/apache/commons/lang3/JavaVersion;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_1:Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 3
    new-instance v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    const-string v1, "JAVA_1_2"

    const/4 v2, 0x2

    const v4, 0x3f99999a    # 1.2f

    const-string v5, "1.2"

    invoke-direct {v0, v1, v2, v4, v5}, Lexternal/org/apache/commons/lang3/JavaVersion;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_2:Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 4
    new-instance v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    const-string v1, "JAVA_1_3"

    const/4 v2, 0x3

    const v4, 0x3fa66666    # 1.3f

    const-string v5, "1.3"

    invoke-direct {v0, v1, v2, v4, v5}, Lexternal/org/apache/commons/lang3/JavaVersion;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_3:Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 5
    new-instance v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    const-string v1, "JAVA_1_4"

    const/4 v2, 0x4

    const v4, 0x3fb33333    # 1.4f

    const-string v5, "1.4"

    invoke-direct {v0, v1, v2, v4, v5}, Lexternal/org/apache/commons/lang3/JavaVersion;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_4:Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 6
    new-instance v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    const-string v1, "JAVA_1_5"

    const/4 v2, 0x5

    const-string v4, "1.5"

    invoke-direct {v0, v1, v2, v3, v4}, Lexternal/org/apache/commons/lang3/JavaVersion;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_5:Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 7
    new-instance v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    const-string v1, "JAVA_1_6"

    const/4 v2, 0x6

    const v3, 0x3fcccccd    # 1.6f

    const-string v4, "1.6"

    invoke-direct {v0, v1, v2, v3, v4}, Lexternal/org/apache/commons/lang3/JavaVersion;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_6:Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 8
    new-instance v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    const-string v1, "JAVA_1_7"

    const/4 v2, 0x7

    const v3, 0x3fd9999a    # 1.7f

    const-string v4, "1.7"

    invoke-direct {v0, v1, v2, v3, v4}, Lexternal/org/apache/commons/lang3/JavaVersion;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_7:Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 9
    new-instance v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    const-string v1, "JAVA_1_8"

    const/16 v2, 0x8

    const v3, 0x3fe66666    # 1.8f

    const-string v4, "1.8"

    invoke-direct {v0, v1, v2, v3, v4}, Lexternal/org/apache/commons/lang3/JavaVersion;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_8:Lexternal/org/apache/commons/lang3/JavaVersion;

    .line 10
    invoke-static {}, Lexternal/org/apache/commons/lang3/JavaVersion;->$values()[Lexternal/org/apache/commons/lang3/JavaVersion;

    move-result-object v0

    sput-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->$VALUES:[Lexternal/org/apache/commons/lang3/JavaVersion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IFLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lexternal/org/apache/commons/lang3/JavaVersion;->value:F

    .line 3
    iput-object p4, p0, Lexternal/org/apache/commons/lang3/JavaVersion;->name:Ljava/lang/String;

    return-void
.end method

.method static get(Ljava/lang/String;)Lexternal/org/apache/commons/lang3/JavaVersion;
    .locals 1

    const-string v0, "0.9"

    .line 1
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object p0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_0_9:Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0

    :cond_0
    const-string v0, "1.1"

    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    sget-object p0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_1:Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0

    :cond_1
    const-string v0, "1.2"

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    sget-object p0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_2:Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0

    :cond_2
    const-string v0, "1.3"

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    sget-object p0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_3:Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0

    :cond_3
    const-string v0, "1.4"

    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    sget-object p0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_4:Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0

    :cond_4
    const-string v0, "1.5"

    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 12
    sget-object p0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_5:Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0

    :cond_5
    const-string v0, "1.6"

    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 14
    sget-object p0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_6:Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0

    :cond_6
    const-string v0, "1.7"

    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 16
    sget-object p0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_7:Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0

    :cond_7
    const-string v0, "1.8"

    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    .line 18
    sget-object p0, Lexternal/org/apache/commons/lang3/JavaVersion;->JAVA_1_8:Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0

    :cond_8
    const/4 p0, 0x0

    return-object p0
.end method

.method static getJavaVersion(Ljava/lang/String;)Lexternal/org/apache/commons/lang3/JavaVersion;
    .locals 0

    .line 1
    invoke-static {p0}, Lexternal/org/apache/commons/lang3/JavaVersion;->get(Ljava/lang/String;)Lexternal/org/apache/commons/lang3/JavaVersion;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lexternal/org/apache/commons/lang3/JavaVersion;
    .locals 1

    .line 1
    const-class v0, Lexternal/org/apache/commons/lang3/JavaVersion;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object p0
.end method

.method public static values()[Lexternal/org/apache/commons/lang3/JavaVersion;
    .locals 1

    .line 1
    sget-object v0, Lexternal/org/apache/commons/lang3/JavaVersion;->$VALUES:[Lexternal/org/apache/commons/lang3/JavaVersion;

    invoke-virtual {v0}, [Lexternal/org/apache/commons/lang3/JavaVersion;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lexternal/org/apache/commons/lang3/JavaVersion;

    return-object v0
.end method


# virtual methods
.method public atLeast(Lexternal/org/apache/commons/lang3/JavaVersion;)Z
    .locals 1

    .line 1
    iget v0, p0, Lexternal/org/apache/commons/lang3/JavaVersion;->value:F

    iget p1, p1, Lexternal/org/apache/commons/lang3/JavaVersion;->value:F

    cmpl-float p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexternal/org/apache/commons/lang3/JavaVersion;->name:Ljava/lang/String;

    return-object v0
.end method
