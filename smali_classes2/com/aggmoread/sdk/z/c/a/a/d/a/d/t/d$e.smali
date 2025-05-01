.class public final enum Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

.field public static final enum d:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

.field public static final enum e:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

.field public static final enum f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

.field public static final enum g:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

.field public static final enum h:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

.field public static final enum i:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

.field private static final synthetic j:[Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;


# instance fields
.field private b:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    const-class v0, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    const-class v2, Lcom/qq/e/ads/splash/SplashAD;

    const-string v3, "SPLASH"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    const-class v3, Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    const-string v5, "UNIFIED"

    const/4 v6, 0x1

    invoke-direct {v2, v5, v6, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->d:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    const-class v5, Lcom/qq/e/ads/nativ/NativeExpressAD;

    const-string v7, "EXPRESS"

    const/4 v8, 0x2

    invoke-direct {v3, v7, v8, v5}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->e:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    new-instance v5, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    const-string v7, "INTERSTITIAL"

    const/4 v9, 0x3

    invoke-direct {v5, v7, v9, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    new-instance v7, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    const-class v10, Lcom/qq/e/ads/rewardvideo/RewardVideoAD;

    const-string v11, "REWARD"

    const/4 v12, 0x4

    invoke-direct {v7, v11, v12, v10}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v7, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->g:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    new-instance v10, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    const-string v11, "FULLSCREEN"

    const/4 v13, 0x5

    invoke-direct {v10, v11, v13, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v10, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->h:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    const-class v11, Lcom/qq/e/ads/banner2/UnifiedBannerView;

    const-string v14, "BANNER"

    const/4 v15, 0x6

    invoke-direct {v0, v14, v15, v11}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->i:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    const/4 v11, 0x7

    new-array v11, v11, [Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    aput-object v1, v11, v4

    aput-object v2, v11, v6

    aput-object v3, v11, v8

    aput-object v5, v11, v9

    aput-object v7, v11, v12

    aput-object v10, v11, v13

    aput-object v0, v11, v15

    sput-object v11, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->j:[Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->b:Ljava/lang/Class;

    return-void
.end method

.method public static b()[Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->j:[Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    invoke-virtual {v0}, [Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AD_TYPE{cls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
