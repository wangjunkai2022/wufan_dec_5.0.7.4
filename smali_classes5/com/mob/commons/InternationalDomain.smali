.class public final enum Lcom/mob/commons/InternationalDomain;
.super Ljava/lang/Enum;

# interfaces
.implements Lcom/mob/tools/proguard/EverythingKeeper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mob/commons/InternationalDomain;",
        ">;",
        "Lcom/mob/tools/proguard/EverythingKeeper;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mob/commons/InternationalDomain;

.field public static final enum DEFAULT:Lcom/mob/commons/InternationalDomain;

.field public static final enum JP:Lcom/mob/commons/InternationalDomain;

.field public static final enum US:Lcom/mob/commons/InternationalDomain;


# instance fields
.field private domain:Ljava/lang/String;

.field private region:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/mob/commons/InternationalDomain;

    const-string v1, "JP"

    const/4 v2, 0x0

    const-string v3, "jp"

    const-string v4, "Japan"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mob/commons/InternationalDomain;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mob/commons/InternationalDomain;->JP:Lcom/mob/commons/InternationalDomain;

    .line 2
    new-instance v1, Lcom/mob/commons/InternationalDomain;

    const-string v3, "US"

    const/4 v4, 0x1

    const-string v5, "us"

    const-string v6, "United States of America"

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/mob/commons/InternationalDomain;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lcom/mob/commons/InternationalDomain;->US:Lcom/mob/commons/InternationalDomain;

    .line 3
    new-instance v3, Lcom/mob/commons/InternationalDomain;

    const-string v5, "DEFAULT"

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-direct {v3, v5, v6, v7, v7}, Lcom/mob/commons/InternationalDomain;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/mob/commons/InternationalDomain;->DEFAULT:Lcom/mob/commons/InternationalDomain;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/mob/commons/InternationalDomain;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lcom/mob/commons/InternationalDomain;->$VALUES:[Lcom/mob/commons/InternationalDomain;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/mob/commons/InternationalDomain;->domain:Ljava/lang/String;

    .line 3
    iput-object p4, p0, Lcom/mob/commons/InternationalDomain;->region:Ljava/lang/String;

    return-void
.end method

.method public static domainOf(Ljava/lang/String;)Lcom/mob/commons/InternationalDomain;
    .locals 5

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Lcom/mob/commons/InternationalDomain;->DEFAULT:Lcom/mob/commons/InternationalDomain;

    return-object p0

    .line 2
    :cond_0
    invoke-static {}, Lcom/mob/commons/InternationalDomain;->values()[Lcom/mob/commons/InternationalDomain;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 3
    iget-object v4, v3, Lcom/mob/commons/InternationalDomain;->domain:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_2
    sget-object p0, Lcom/mob/commons/InternationalDomain;->DEFAULT:Lcom/mob/commons/InternationalDomain;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mob/commons/InternationalDomain;
    .locals 1

    .line 1
    const-class v0, Lcom/mob/commons/InternationalDomain;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mob/commons/InternationalDomain;

    return-object p0
.end method

.method public static values()[Lcom/mob/commons/InternationalDomain;
    .locals 1

    .line 1
    sget-object v0, Lcom/mob/commons/InternationalDomain;->$VALUES:[Lcom/mob/commons/InternationalDomain;

    invoke-virtual {v0}, [Lcom/mob/commons/InternationalDomain;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mob/commons/InternationalDomain;

    return-object v0
.end method


# virtual methods
.method public getDomain()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mob/commons/InternationalDomain;->domain:Ljava/lang/String;

    return-object v0
.end method

.method public getRegion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mob/commons/InternationalDomain;->region:Ljava/lang/String;

    return-object v0
.end method
