.class public final Lcom/kwad/components/core/e/d/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/e/d/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private KS:Z

.field private KT:Z

.field private KU:Z

.field private KV:Z

.field private KW:Z

.field private KX:Z

.field private KY:Z

.field private KZ:Lcom/kwad/components/core/e/d/a$b;

.field private La:Lcom/kwad/components/core/e/d/c;

.field private Lb:Z

.field private Lc:Z

.field private Ld:J

.field private Le:Z

.field private Lf:Z

.field public Lg:I

.field public Lh:Ljava/lang/String;

.field public Li:Lcom/kwad/sdk/core/adlog/a$a;

.field public Lj:I

.field public Lk:I

.field private Ll:Lorg/json/JSONObject;

.field private Lm:Z

.field private Ln:Z

.field private Lo:I

.field private Lp:I

.field private Lq:I

.field private Lr:I

.field private Ls:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private Lt:Ljava/lang/String;

.field private adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private final context:Landroid/content/Context;

.field private kj:I

.field private kl:I

.field public kn:Lcom/kwad/sdk/utils/ac$a;

.field public vA:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lg:I

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Lcom/kwad/components/core/e/d/a$a;->Lj:I

    .line 4
    iput v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lk:I

    .line 5
    iput-boolean v1, p0, Lcom/kwad/components/core/e/d/a$a;->Lm:Z

    .line 6
    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->context:Landroid/content/Context;

    return-void
.end method

.method static synthetic o(Lcom/kwad/components/core/e/d/a$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/e/d/a$a;->Lb:Z

    return p0
.end method

.method static synthetic p(Lcom/kwad/components/core/e/d/a$a;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/e/d/a$a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->KZ:Lcom/kwad/components/core/e/d/a$b;

    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/f/a;)Lcom/kwad/components/core/e/d/a$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/f/a<",
            "Lcom/kwad/sdk/core/track/AdTrackLog;",
            ">;)",
            "Lcom/kwad/components/core/e/d/a$a;"
        }
    .end annotation

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    if-nez p1, :cond_0

    .line 4
    new-instance p1, Lcom/kwad/sdk/core/adlog/a$a;

    invoke-direct {p1}, Lcom/kwad/sdk/core/adlog/a$a;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    iget-object p2, p0, Lcom/kwad/components/core/e/d/a$a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3, p3, p3}, Lcom/kwad/sdk/core/adlog/a$a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/f/a;)Lcom/kwad/sdk/core/track/AdTrackLog;

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Callable;)Lcom/kwad/components/core/e/d/a$a;
    .locals 0
    .param p1    # Ljava/util/concurrent/Callable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kwad/components/core/e/d/a$a;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->Ls:Ljava/util/concurrent/Callable;

    return-object p0
.end method

.method public final ag(Ljava/lang/String;)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lt:Ljava/lang/String;

    return-object p0
.end method

.method public final ah(Ljava/lang/String;)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lh:Ljava/lang/String;

    return-object p0
.end method

.method public final ak(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lp:I

    return-void
.end method

.method public final ak(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lc:Z

    return-void
.end method

.method public final al(I)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lr:I

    return-object p0
.end method

.method public final al(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->KX:Z

    return-object p0
.end method

.method public final am(I)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/e/d/a$a;->kl:I

    return-object p0
.end method

.method public final am(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->KY:Z

    return-object p0
.end method

.method public final an(I)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 2
    iput p1, p0, Lcom/kwad/components/core/e/d/a$a;->kj:I

    return-object p0
.end method

.method public final an(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->KW:Z

    return-object p0
.end method

.method public final ao(I)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 2
    iput p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lj:I

    return-object p0
.end method

.method public final ao(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lb:Z

    return-object p0
.end method

.method public final ap(I)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 2
    iput p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lk:I

    return-object p0
.end method

.method public final ap(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->Le:Z

    return-object p0
.end method

.method public final aq(I)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 2
    iput p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lo:I

    return-object p0
.end method

.method public final aq(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lf:Z

    return-object p0
.end method

.method public final ar(I)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 3
    iput p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lq:I

    return-object p0
.end method

.method public final ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method public final ar(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->Lm:Z

    return-object p0
.end method

.method public final as(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->KT:Z

    return-object p0
.end method

.method public final at(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->KV:Z

    return-object p0
.end method

.method public final au(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->KS:Z

    return-object p0
.end method

.method public final av(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->Ln:Z

    return-object p0
.end method

.method public final aw(Z)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/a$a;->KU:Z

    return-object p0
.end method

.method public final b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->La:Lcom/kwad/components/core/e/d/c;

    return-object p0
.end method

.method public final c(Lorg/json/JSONObject;)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->Ll:Lorg/json/JSONObject;

    return-object p0
.end method

.method public final cV()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/e/d/a$a;->kj:I

    return v0
.end method

.method public final cY()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/e/d/a$a;->kl:I

    return v0
.end method

.method public final d(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/a$a;->kn:Lcom/kwad/sdk/utils/ac$a;

    return-object p0
.end method

.method public final getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/a$a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/a$a;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final ha()Lcom/kwad/components/core/e/d/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/a$a;->La:Lcom/kwad/components/core/e/d/c;

    return-object v0
.end method

.method public final ho()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/a$a;->Ll:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final nX()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lt:Ljava/lang/String;

    return-object v0
.end method

.method public final nY()Ljava/util/concurrent/Callable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/a$a;->Ls:Ljava/util/concurrent/Callable;

    return-object v0
.end method

.method public final nZ()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lc:Z

    return v0
.end method

.method public final oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lp:I

    return v0
.end method

.method public final ob()Lcom/kwad/components/core/e/d/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/a$a;->KZ:Lcom/kwad/components/core/e/d/a$b;

    return-object v0
.end method

.method public final oc()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->KW:Z

    return v0
.end method

.method public final od()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lr:I

    return v0
.end method

.method public final oe()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->KX:Z

    return v0
.end method

.method public final of()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->KY:Z

    return v0
.end method

.method public final og()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lb:Z

    return v0
.end method

.method public final oh()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/e/d/a$a;->Ld:J

    return-wide v0
.end method

.method public final oi()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->Le:Z

    return v0
.end method

.method public final oj()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lf:Z

    return v0
.end method

.method public final ok()Lcom/kwad/sdk/core/adlog/c/a;
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/adlog/c/a;->BZ()Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    iget v1, p0, Lcom/kwad/components/core/e/d/a$a;->kl:I

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/a;->cE(I)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/e/d/a$a;->Lh:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/a;->dl(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/e/d/a$a;->kn:Lcom/kwad/sdk/utils/ac$a;

    .line 4
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/a;->e(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    iget v1, p0, Lcom/kwad/components/core/e/d/a$a;->Lj:I

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/a;->cF(I)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    iget v1, p0, Lcom/kwad/components/core/e/d/a$a;->Lk:I

    .line 6
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/a;->cG(I)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    iget-wide v1, p0, Lcom/kwad/components/core/e/d/a$a;->vA:J

    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/core/adlog/c/a;->am(J)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/e/d/a$a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    .line 8
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/a;->a(Lcom/kwad/sdk/core/adlog/a$a;)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    iget v1, p0, Lcom/kwad/components/core/e/d/a$a;->Lg:I

    .line 9
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/a;->cH(I)Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v0

    return-object v0
.end method

.method public final ol()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lm:Z

    return v0
.end method

.method public final om()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->KT:Z

    return v0
.end method

.method public final on()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->KV:Z

    return v0
.end method

.method public final oo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->KS:Z

    return v0
.end method

.method public final op()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->Ln:Z

    return v0
.end method

.method public final oq()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lo:I

    return v0
.end method

.method public final or()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/e/d/a$a;->Lq:I

    return v0
.end method

.method public final os()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/d/a$a;->KU:Z

    return v0
.end method

.method public final v(J)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/e/d/a$a;->Ld:J

    return-object p0
.end method

.method public final w(J)Lcom/kwad/components/core/e/d/a$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/e/d/a$a;->vA:J

    return-object p0
.end method
