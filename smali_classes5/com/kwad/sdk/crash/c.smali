.class public Lcom/kwad/sdk/crash/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/crash/c$a;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "c"


# instance fields
.field public final aAC:Ljava/lang/String;

.field public final aGA:[Ljava/lang/String;

.field public final aGB:[Ljava/lang/String;

.field public final aGC:Z

.field public final aGD:Lcom/kwad/sdk/crash/f;

.field public final aGE:Ljava/lang/String;

.field public final aGF:Ljava/lang/String;

.field public final aGG:Ljava/lang/String;

.field public final aGH:Ljava/lang/String;

.field public final aGI:Ljava/lang/String;

.field public final aGJ:Ljava/lang/String;

.field public final aGK:Ljava/lang/String;

.field public final aGL:Ljava/lang/String;

.field public final aGM:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/crash/a;",
            ">;"
        }
    .end annotation
.end field

.field public final aGp:D

.field public final aGt:Z

.field public final aGu:Z

.field public final aGx:Lcom/kwad/sdk/crash/model/c;

.field public final aGy:Lcom/kwad/sdk/crash/model/a;

.field public final aGz:Lcom/kwad/sdk/crash/h;

.field public final alT:Z

.field public final channel:Ljava/lang/String;

.field public final context:Landroid/content/Context;

.field public final platform:Ljava/lang/String;

.field public final sdkVersion:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/kwad/sdk/crash/c$a;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/kwad/sdk/crash/model/c;

    invoke-direct {v0}, Lcom/kwad/sdk/crash/model/c;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/crash/c;->aGx:Lcom/kwad/sdk/crash/model/c;

    .line 4
    new-instance v1, Lcom/kwad/sdk/crash/model/a;

    invoke-direct {v1}, Lcom/kwad/sdk/crash/model/a;-><init>()V

    iput-object v1, p0, Lcom/kwad/sdk/crash/c;->aGy:Lcom/kwad/sdk/crash/model/a;

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/kwad/sdk/crash/c;->aGM:Ljava/util/List;

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->a(Lcom/kwad/sdk/crash/c$a;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/kwad/sdk/crash/c;->aGC:Z

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->b(Lcom/kwad/sdk/crash/c$a;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/kwad/sdk/crash/c;->aGt:Z

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->c(Lcom/kwad/sdk/crash/c$a;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/kwad/sdk/crash/c;->aGu:Z

    .line 9
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->d(Lcom/kwad/sdk/crash/c$a;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/kwad/sdk/crash/c;->alT:Z

    .line 10
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->e(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aGI:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->f(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aGJ:Ljava/lang/String;

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->g(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aGK:Ljava/lang/String;

    .line 13
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->h(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aGL:Ljava/lang/String;

    .line 14
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->i(Lcom/kwad/sdk/crash/c$a;)Landroid/content/Context;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->context:Landroid/content/Context;

    .line 15
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->j(Lcom/kwad/sdk/crash/c$a;)Lcom/kwad/sdk/crash/f;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aGD:Lcom/kwad/sdk/crash/f;

    .line 16
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->k(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->platform:Ljava/lang/String;

    .line 17
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->l(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aGE:Ljava/lang/String;

    .line 18
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->m(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aGF:Ljava/lang/String;

    .line 19
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->n(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->sdkVersion:Ljava/lang/String;

    .line 20
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->o(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aAC:Ljava/lang/String;

    .line 21
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->p(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->channel:Ljava/lang/String;

    .line 22
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->q(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aGG:Ljava/lang/String;

    .line 23
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->r(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/crash/c;->aGH:Ljava/lang/String;

    .line 24
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->s(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/kwad/sdk/crash/model/a;->aHr:Ljava/lang/String;

    .line 25
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->t(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/kwad/sdk/crash/model/a;->mAppName:Ljava/lang/String;

    .line 26
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->u(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/kwad/sdk/crash/model/a;->aHt:Ljava/lang/String;

    .line 27
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->v(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/kwad/sdk/crash/model/a;->aHs:Ljava/lang/String;

    .line 28
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->w(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/crash/model/c;->aHC:Ljava/lang/String;

    .line 29
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->x(Lcom/kwad/sdk/crash/c$a;)I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/crash/model/c;->aHD:I

    .line 30
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->n(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/crash/model/c;->mSdkVersion:Ljava/lang/String;

    .line 31
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->y(Lcom/kwad/sdk/crash/c$a;)I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/crash/model/c;->aHB:I

    .line 32
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->z(Lcom/kwad/sdk/crash/c$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/crash/model/c;->aHA:Ljava/lang/String;

    .line 33
    iget v1, p1, Lcom/kwad/sdk/crash/c$a;->sdkType:I

    iput v1, v0, Lcom/kwad/sdk/crash/model/c;->aHE:I

    .line 34
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->A(Lcom/kwad/sdk/crash/c$a;)Lcom/kwad/sdk/crash/h;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/crash/c;->aGz:Lcom/kwad/sdk/crash/h;

    .line 35
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->B(Lcom/kwad/sdk/crash/c$a;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/crash/c;->aGA:[Ljava/lang/String;

    .line 36
    iget-object v0, p1, Lcom/kwad/sdk/crash/c$a;->aGQ:[Ljava/lang/String;

    iput-object v0, p0, Lcom/kwad/sdk/crash/c;->aGB:[Ljava/lang/String;

    .line 37
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->C(Lcom/kwad/sdk/crash/c$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 38
    invoke-static {p1}, Lcom/kwad/sdk/crash/c$a;->D(Lcom/kwad/sdk/crash/c$a;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/crash/c;->aGp:D

    return-void
.end method

.method synthetic constructor <init>(Lcom/kwad/sdk/crash/c$a;B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/crash/c;-><init>(Lcom/kwad/sdk/crash/c$a;)V

    return-void
.end method

.method static synthetic Id()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/crash/c;->TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final Ib()Lcom/kwad/sdk/crash/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/c;->aGD:Lcom/kwad/sdk/crash/f;

    return-object v0
.end method

.method public final Ic()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/crash/c;->aGC:Z

    return v0
.end method
