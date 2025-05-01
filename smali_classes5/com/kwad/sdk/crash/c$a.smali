.class public final Lcom/kwad/sdk/crash/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/crash/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private XB:Ljava/lang/String;

.field private XC:I

.field private aAC:Ljava/lang/String;

.field private aGC:Z

.field private aGD:Lcom/kwad/sdk/crash/f;

.field private aGE:Ljava/lang/String;

.field private aGF:Ljava/lang/String;

.field private aGG:Ljava/lang/String;

.field private aGH:Ljava/lang/String;

.field private aGI:Ljava/lang/String;

.field private aGJ:Ljava/lang/String;

.field private aGK:Ljava/lang/String;

.field private aGL:Ljava/lang/String;

.field private aGM:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/crash/a;",
            ">;"
        }
    .end annotation
.end field

.field private aGN:Ljava/lang/String;

.field private aGO:Lcom/kwad/sdk/crash/h;

.field private aGP:[Ljava/lang/String;

.field public aGQ:[Ljava/lang/String;

.field private aGp:D

.field private aGt:Z

.field private aGu:Z

.field private alT:Z

.field private appId:Ljava/lang/String;

.field private appName:Ljava/lang/String;

.field private appPackageName:Ljava/lang/String;

.field private appVersion:Ljava/lang/String;

.field private azZ:I

.field private channel:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private platform:Ljava/lang/String;

.field public sdkType:I

.field private sdkVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/crash/c$a;->aGC:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/crash/c$a;->aGt:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/sdk/crash/c$a;->aGu:Z

    .line 5
    iput-boolean v0, p0, Lcom/kwad/sdk/crash/c$a;->alT:Z

    const-string v0, ""

    .line 6
    iput-object v0, p0, Lcom/kwad/sdk/crash/c$a;->aGI:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/kwad/sdk/crash/c$a;->aGJ:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lcom/kwad/sdk/crash/c$a;->aGK:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lcom/kwad/sdk/crash/c$a;->aGL:Ljava/lang/String;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/crash/c$a;->aGM:Ljava/util/List;

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 11
    iput-wide v0, p0, Lcom/kwad/sdk/crash/c$a;->aGp:D

    return-void
.end method

.method static synthetic A(Lcom/kwad/sdk/crash/c$a;)Lcom/kwad/sdk/crash/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGO:Lcom/kwad/sdk/crash/h;

    return-object p0
.end method

.method static synthetic B(Lcom/kwad/sdk/crash/c$a;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGP:[Ljava/lang/String;

    return-object p0
.end method

.method static synthetic C(Lcom/kwad/sdk/crash/c$a;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGM:Ljava/util/List;

    return-object p0
.end method

.method static synthetic D(Lcom/kwad/sdk/crash/c$a;)D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/crash/c$a;->aGp:D

    return-wide v0
.end method

.method static synthetic a(Lcom/kwad/sdk/crash/c$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/crash/c$a;->aGC:Z

    return p0
.end method

.method static synthetic b(Lcom/kwad/sdk/crash/c$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/crash/c$a;->aGt:Z

    return p0
.end method

.method static synthetic c(Lcom/kwad/sdk/crash/c$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/crash/c$a;->aGu:Z

    return p0
.end method

.method static synthetic d(Lcom/kwad/sdk/crash/c$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/sdk/crash/c$a;->alT:Z

    return p0
.end method

.method static synthetic e(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGI:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGJ:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGK:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGL:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/sdk/crash/c$a;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic j(Lcom/kwad/sdk/crash/c$a;)Lcom/kwad/sdk/crash/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGD:Lcom/kwad/sdk/crash/f;

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->platform:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGE:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic m(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGF:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic n(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->sdkVersion:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic o(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aAC:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic p(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->channel:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic q(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGG:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic r(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGH:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic s(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->appId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic t(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->appName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic u(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->appVersion:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic v(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->appPackageName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic w(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->XB:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic x(Lcom/kwad/sdk/crash/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/crash/c$a;->XC:I

    return p0
.end method

.method static synthetic y(Lcom/kwad/sdk/crash/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/crash/c$a;->azZ:I

    return p0
.end method

.method static synthetic z(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/crash/c$a;->aGN:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final E(Ljava/util/List;)Lcom/kwad/sdk/crash/c$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kwad/sdk/crash/c$a;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance v0, Lcom/kwad/sdk/crash/a;

    invoke-direct {v0}, Lcom/kwad/sdk/crash/a;-><init>()V

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/crash/c$a;->aGM:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-static {}, Lcom/kwad/sdk/crash/c;->Id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public final Ie()Lcom/kwad/sdk/crash/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/crash/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kwad/sdk/crash/c;-><init>(Lcom/kwad/sdk/crash/c$a;B)V

    return-object v0
.end method

.method public final a(Lcom/kwad/sdk/crash/f;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGD:Lcom/kwad/sdk/crash/f;

    return-object p0
.end method

.method public final a(Lcom/kwad/sdk/crash/h;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGO:Lcom/kwad/sdk/crash/h;

    return-object p0
.end method

.method public final bI(Landroid/content/Context;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->context:Landroid/content/Context;

    return-object p0
.end method

.method public final bx(Z)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/crash/c$a;->aGt:Z

    return-object p0
.end method

.method public final by(Z)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/crash/c$a;->aGu:Z

    return-object p0
.end method

.method public final bz(Z)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/crash/c$a;->alT:Z

    return-object p0
.end method

.method public final d([Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGP:[Ljava/lang/String;

    return-object p0
.end method

.method public final dA(I)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput p1, p0, Lcom/kwad/sdk/crash/c$a;->sdkType:I

    return-object p0
.end method

.method public final dy(I)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/crash/c$a;->azZ:I

    return-object p0
.end method

.method public final dz(I)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/crash/c$a;->XC:I

    return-object p0
.end method

.method public final e([Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGQ:[Ljava/lang/String;

    return-object p0
.end method

.method public final fj(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGI:Ljava/lang/String;

    return-object p0
.end method

.method public final fk(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGJ:Ljava/lang/String;

    return-object p0
.end method

.method public final fl(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->platform:Ljava/lang/String;

    return-object p0
.end method

.method public final fm(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGE:Ljava/lang/String;

    return-object p0
.end method

.method public final fn(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aAC:Ljava/lang/String;

    return-object p0
.end method

.method public final fo(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->channel:Ljava/lang/String;

    return-object p0
.end method

.method public final fp(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGH:Ljava/lang/String;

    return-object p0
.end method

.method public final fq(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGN:Ljava/lang/String;

    return-object p0
.end method

.method public final fr(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->sdkVersion:Ljava/lang/String;

    return-object p0
.end method

.method public final fs(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->XB:Ljava/lang/String;

    return-object p0
.end method

.method public final ft(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->appPackageName:Ljava/lang/String;

    return-object p0
.end method

.method public final fu(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->appId:Ljava/lang/String;

    return-object p0
.end method

.method public final fv(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->appName:Ljava/lang/String;

    return-object p0
.end method

.method public final fw(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->appVersion:Ljava/lang/String;

    return-object p0
.end method

.method public final fx(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGF:Ljava/lang/String;

    return-object p0
.end method

.method public final fy(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGK:Ljava/lang/String;

    return-object p0
.end method

.method public final fz(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/c$a;->aGL:Ljava/lang/String;

    return-object p0
.end method

.method public final m(D)Lcom/kwad/sdk/crash/c$a;
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/kwad/sdk/crash/c$a;->aGp:D

    return-object p0
.end method
