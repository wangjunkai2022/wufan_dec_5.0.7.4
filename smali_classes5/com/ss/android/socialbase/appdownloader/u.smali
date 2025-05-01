.class public Lcom/ss/android/socialbase/appdownloader/u;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;

.field private ah:I

.field private b:Z

.field private c:Z

.field private cl:J

.field private cq:I

.field private d:Z

.field private ds:Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

.field private e:Lcom/ss/android/socialbase/downloader/depend/a;

.field private ev:Z

.field private f:Z

.field private ff:Z

.field private fn:Ljava/lang/String;

.field private fo:Lcom/ss/android/socialbase/downloader/depend/g;

.field private g:Lcom/ss/android/socialbase/downloader/downloader/n;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/lang/String;

.field private jb:Z

.field private jh:Z

.field private ju:Z

.field private k:Z

.field private ky:Lcom/ss/android/socialbase/downloader/depend/t;

.field private l:Ljava/lang/String;

.field private la:Lcom/ss/android/socialbase/downloader/downloader/qv;

.field private lb:Lcom/ss/android/socialbase/downloader/depend/l;

.field private m:Landroid/content/Context;

.field private n:Ljava/lang/String;

.field private nn:Lorg/json/JSONObject;

.field private ns:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private ot:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

.field private p:Ljava/lang/String;

.field private pd:I

.field private pj:Z

.field private pl:Z

.field private q:Ljava/lang/String;

.field private qb:Ljava/lang/String;

.field private qd:Z

.field private qv:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;"
        }
    .end annotation
.end field

.field private r:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

.field private rm:Ljava/lang/String;

.field private s:Lcom/ss/android/socialbase/appdownloader/p/o;

.field private sr:Z

.field private t:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

.field private td:I

.field private tf:I

.field private to:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/r;",
            ">;"
        }
    .end annotation
.end field

.field private u:Ljava/lang/String;

.field private uw:[I

.field private v:Z

.field private vu:J

.field private vv:Landroid/app/Activity;

.field private w:Z

.field private wv:Z

.field private x:Lcom/ss/android/socialbase/downloader/downloader/la;

.field private y:Lcom/ss/android/socialbase/downloader/notification/vv;

.field private ya:Z

.field private yj:I

.field private zn:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->wv:Z

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/ss/android/socialbase/appdownloader/u;->k:Z

    .line 4
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->b:Z

    .line 5
    iput-boolean v1, p0, Lcom/ss/android/socialbase/appdownloader/u;->jh:Z

    const-string v1, "application/vnd.android.package-archive"

    .line 6
    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/u;->j:Ljava/lang/String;

    const/4 v1, 0x5

    .line 7
    iput v1, p0, Lcom/ss/android/socialbase/appdownloader/u;->td:I

    .line 8
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->c:Z

    .line 9
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_NONE:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/u;->ot:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    const/16 v1, 0x96

    .line 10
    iput v1, p0, Lcom/ss/android/socialbase/appdownloader/u;->cq:I

    .line 11
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->jb:Z

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/u;->to:Ljava/util/List;

    .line 13
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->qd:Z

    .line 14
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->pl:Z

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->m:Landroid/content/Context;

    .line 16
    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/u;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->tf:I

    return v0
.end method

.method public ah()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->qd:Z

    return v0
.end method

.method public b(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->qb:Ljava/lang/String;

    return-object p0
.end method

.method public b(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->pj:Z

    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->q:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->pj:Z

    return v0
.end method

.method public cl()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->sr:Z

    return v0
.end method

.method public cq()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->ff:Z

    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->v:Z

    return v0
.end method

.method public ds()Lcom/ss/android/socialbase/downloader/depend/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->e:Lcom/ss/android/socialbase/downloader/depend/a;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->ju:Z

    return v0
.end method

.method public ev()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->rm:Ljava/lang/String;

    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->ev:Z

    return v0
.end method

.method public ff()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->c:Z

    return v0
.end method

.method public fo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/r;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->to:Ljava/util/List;

    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->ya:Z

    return v0
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->vv:Landroid/app/Activity;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->m:Landroid/content/Context;

    return-object v0
.end method

.method public i(I)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->cq:I

    return-object p0
.end method

.method public i(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->rm:Ljava/lang/String;

    return-object p0
.end method

.method public i(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->d:Z

    return-object p0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->qv:Ljava/util/List;

    return-object v0
.end method

.method public j(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->qd:Z

    return-object p0
.end method

.method public j()Lcom/ss/android/socialbase/downloader/downloader/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->g:Lcom/ss/android/socialbase/downloader/downloader/n;

    return-object v0
.end method

.method public jb()Lcom/ss/android/socialbase/downloader/depend/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->lb:Lcom/ss/android/socialbase/downloader/depend/l;

    return-object v0
.end method

.method public jh(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->f:Z

    return-object p0
.end method

.method public jh()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->j:Ljava/lang/String;

    return-object v0
.end method

.method public ju()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->yj:I

    return v0
.end method

.method public k(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->fn:Ljava/lang/String;

    return-object p0
.end method

.method public k(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->zn:Z

    return-object p0
.end method

.method public k()Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->t:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    return-object v0
.end method

.method public ky()Lcom/ss/android/socialbase/appdownloader/p/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->s:Lcom/ss/android/socialbase/appdownloader/p/o;

    return-object v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->pd:I

    return v0
.end method

.method public la()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->ah:I

    return v0
.end method

.method public lb()Lcom/ss/android/socialbase/downloader/depend/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->ky:Lcom/ss/android/socialbase/downloader/depend/t;

    return-object v0
.end method

.method public m(I)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->td:I

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->u:Ljava/lang/String;

    return-object p0
.end method

.method public m(Ljava/util/List;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ss/android/socialbase/appdownloader/u;"
        }
    .end annotation

    .line 5
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->i:Ljava/util/List;

    return-object p0
.end method

.method public m(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->k:Z

    return-object p0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->o:Ljava/lang/String;

    return-object v0
.end method

.method public n(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->l:Ljava/lang/String;

    return-object p0
.end method

.method public n(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->w:Z

    return-object p0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->b:Z

    return v0
.end method

.method public nn()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->cl:J

    return-wide v0
.end method

.method public ns()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->w:Z

    return v0
.end method

.method public o(I)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->tf:I

    return-object p0
.end method

.method public o(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->q:Ljava/lang/String;

    return-object p0
.end method

.method public o(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->v:Z

    return-object p0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->wv:Z

    return v0
.end method

.method public ot()Lcom/ss/android/socialbase/downloader/constants/EnqueueType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->ot:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    return-object v0
.end method

.method public p(I)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->pd:I

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->n:Ljava/lang/String;

    return-object p0
.end method

.method public p(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->jh:Z

    return-object p0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->n:Ljava/lang/String;

    return-object v0
.end method

.method public pd()Lcom/ss/android/socialbase/downloader/downloader/la;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->x:Lcom/ss/android/socialbase/downloader/downloader/la;

    return-object v0
.end method

.method public pj()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->jb:Z

    return v0
.end method

.method public pl()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->nn:Lorg/json/JSONObject;

    return-object v0
.end method

.method public q(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->sr:Z

    return-object p0
.end method

.method public q()Lcom/ss/android/socialbase/downloader/downloader/qv;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->la:Lcom/ss/android/socialbase/downloader/downloader/qv;

    return-object v0
.end method

.method public qb()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->pl:Z

    return v0
.end method

.method public qd()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->i:Ljava/util/List;

    return-object v0
.end method

.method public qv(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->ns:Ljava/lang/String;

    return-object p0
.end method

.method public qv(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->ev:Z

    return-object p0
.end method

.method public qv()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->jh:Z

    return v0
.end method

.method public r(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->jb:Z

    return-object p0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->d:Z

    return v0
.end method

.method public rm()Lcom/ss/android/socialbase/downloader/depend/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->fo:Lcom/ss/android/socialbase/downloader/depend/g;

    return-object v0
.end method

.method public s()Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->ds:Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    return-object v0
.end method

.method public sr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->qb:Ljava/lang/String;

    return-object v0
.end method

.method public t(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->ff:Z

    return-object p0
.end method

.method public t()Lcom/ss/android/socialbase/downloader/notification/vv;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->y:Lcom/ss/android/socialbase/downloader/notification/vv;

    return-object v0
.end method

.method public td()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->zn:Z

    return v0
.end method

.method public tf()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->u:Ljava/lang/String;

    return-object v0
.end method

.method public to()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->fn:Ljava/lang/String;

    return-object v0
.end method

.method public u(I)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->yj:I

    return-object p0
.end method

.method public u(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->j:Ljava/lang/String;

    return-object p0
.end method

.method public u(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->ya:Z

    return-object p0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->k:Z

    return v0
.end method

.method public v()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->vu:J

    return-wide v0
.end method

.method public vu()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->a:Ljava/lang/String;

    return-object v0
.end method

.method public vv(J)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 7
    iput-wide p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->vu:J

    return-object p0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/constants/EnqueueType;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->ot:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    return-object p0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->ds:Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    return-object p0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->r:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    return-object p0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/depend/g;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->fo:Lcom/ss/android/socialbase/downloader/depend/g;

    return-object p0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/depend/r;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 2

    .line 12
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->to:Ljava/util/List;

    monitor-enter v0

    if-eqz p1, :cond_1

    .line 13
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/u;->to:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/u;->to:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    monitor-exit v0

    return-object p0

    .line 16
    :cond_1
    :goto_0
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->o:Ljava/lang/String;

    return-object p0
.end method

.method public vv(Ljava/util/List;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;)",
            "Lcom/ss/android/socialbase/appdownloader/u;"
        }
    .end annotation

    .line 4
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->qv:Ljava/util/List;

    return-object p0
.end method

.method public vv(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->nn:Lorg/json/JSONObject;

    return-object p0
.end method

.method public vv(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->wv:Z

    return-object p0
.end method

.method public vv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->p:Ljava/lang/String;

    return-object v0
.end method

.method public vv(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->ah:I

    return-void
.end method

.method public w()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->cq:I

    return v0
.end method

.method public wv(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->a:Ljava/lang/String;

    return-object p0
.end method

.method public wv(Z)Lcom/ss/android/socialbase/appdownloader/u;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/u;->c:Z

    return-object p0
.end method

.method public wv()Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->r:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->l:Ljava/lang/String;

    return-object v0
.end method

.method public y()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->ns:Ljava/lang/String;

    return-object v0
.end method

.method public ya()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->td:I

    return v0
.end method

.method public yj()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->uw:[I

    return-object v0
.end method

.method public zn()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/u;->f:Z

    return v0
.end method
