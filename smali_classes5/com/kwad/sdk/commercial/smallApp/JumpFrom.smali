.class public final enum Lcom/kwad/sdk/commercial/smallApp/JumpFrom;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kwad/sdk/commercial/smallApp/JumpFrom;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

.field public static final enum AD_PAGE:Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

.field public static final enum H5:Lcom/kwad/sdk/commercial/smallApp/JumpFrom;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    const-string v1, "H5"

    const/4 v2, 0x0

    const-string v3, "h5"

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;->H5:Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    .line 2
    new-instance v1, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    const-string v3, "AD_PAGE"

    const/4 v4, 0x1

    const-string v5, "ad_page"

    invoke-direct {v1, v3, v4, v5}, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;->AD_PAGE:Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;->$VALUES:[Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;->value:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/JumpFrom;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    return-object p0
.end method

.method public static values()[Lcom/kwad/sdk/commercial/smallApp/JumpFrom;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;->$VALUES:[Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    invoke-virtual {v0}, [Lcom/kwad/sdk/commercial/smallApp/JumpFrom;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/commercial/smallApp/JumpFrom;->value:Ljava/lang/String;

    return-object v0
.end method
