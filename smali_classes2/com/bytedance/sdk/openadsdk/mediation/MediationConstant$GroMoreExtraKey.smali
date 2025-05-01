.class public final enum Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "GroMoreExtraKey"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CUSTOMIZE_RIT_SCENES:Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

.field public static final enum RIT_SCENES:Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

.field private static final synthetic m:[Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;


# instance fields
.field final vv:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

    const-string v1, "CUSTOMIZE_RIT_SCENES"

    const/4 v2, 0x0

    const-string v3, "groMore_key_customize_rit_scenes"

    invoke-direct {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;->CUSTOMIZE_RIT_SCENES:Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

    .line 2
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

    const-string v3, "RIT_SCENES"

    const/4 v4, 0x1

    const-string v5, "groMore_key_rit_scenes"

    invoke-direct {v1, v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;->RIT_SCENES:Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;->m:[Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

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
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;->vv:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;
    .locals 1

    .line 1
    const-class v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

    return-object p0
.end method

.method public static values()[Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;->m:[Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

    invoke-virtual {v0}, [Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;

    return-object v0
.end method


# virtual methods
.method public getExtraKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationConstant$GroMoreExtraKey;->vv:Ljava/lang/String;

    return-object v0
.end method
