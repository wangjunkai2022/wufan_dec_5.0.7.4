.class public Lcom/php25/PDownload/DownloadFile;
.super Ljava/lang/Object;
.source "DownloadFile.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private A:Ljava/lang/String;

.field private B:I

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Z

.field private I:Ljava/lang/String;

.field private J:I

.field private b:Ljava/lang/Long;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/Integer;

.field private k:Z

.field private l:Z

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Z

.field private t:Ljava/lang/String;

.field private u:Z

.field private v:J

.field private w:J

.field private x:J

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TipBean;",
            ">;"
        }
    .end annotation
.end field

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/php25/PDownload/DownloadFile;->j:Ljava/lang/Integer;

    const-wide/16 v0, 0x0

    .line 41
    iput-wide v0, p0, Lcom/php25/PDownload/DownloadFile;->w:J

    const/4 v0, -0x1

    .line 42
    iput v0, p0, Lcom/php25/PDownload/DownloadFile;->J:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZJJJLjava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "ZJJJ",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TipBean;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->j:Ljava/lang/Integer;

    const-wide/16 v1, 0x0

    .line 3
    iput-wide v1, v0, Lcom/php25/PDownload/DownloadFile;->w:J

    const/4 v1, -0x1

    .line 4
    iput v1, v0, Lcom/php25/PDownload/DownloadFile;->J:I

    move-object v1, p1

    .line 5
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->b:Ljava/lang/Long;

    move-object v1, p2

    .line 6
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->c:Ljava/lang/String;

    move-object v1, p3

    .line 7
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->d:Ljava/lang/String;

    move-object v1, p4

    .line 8
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->e:Ljava/lang/String;

    move-object v1, p5

    .line 9
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->f:Ljava/lang/String;

    move-object v1, p6

    .line 10
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->g:Ljava/lang/String;

    move-object v1, p7

    .line 11
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->h:Ljava/lang/String;

    move-object v1, p8

    .line 12
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->i:Ljava/lang/String;

    move-object v1, p9

    .line 13
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->j:Ljava/lang/Integer;

    move v1, p10

    .line 14
    iput-boolean v1, v0, Lcom/php25/PDownload/DownloadFile;->k:Z

    move v1, p11

    .line 15
    iput-boolean v1, v0, Lcom/php25/PDownload/DownloadFile;->l:Z

    move-object v1, p12

    .line 16
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->m:Ljava/lang/String;

    move-object/from16 v1, p13

    .line 17
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->n:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 18
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->o:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 19
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->p:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 20
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->q:Ljava/lang/String;

    move-object/from16 v1, p17

    .line 21
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->r:Ljava/lang/String;

    move/from16 v1, p18

    .line 22
    iput-boolean v1, v0, Lcom/php25/PDownload/DownloadFile;->s:Z

    move-object/from16 v1, p19

    .line 23
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->t:Ljava/lang/String;

    move/from16 v1, p20

    .line 24
    iput-boolean v1, v0, Lcom/php25/PDownload/DownloadFile;->u:Z

    move-wide/from16 v1, p21

    .line 25
    iput-wide v1, v0, Lcom/php25/PDownload/DownloadFile;->v:J

    move-wide/from16 v1, p23

    .line 26
    iput-wide v1, v0, Lcom/php25/PDownload/DownloadFile;->w:J

    move-wide/from16 v1, p25

    .line 27
    iput-wide v1, v0, Lcom/php25/PDownload/DownloadFile;->x:J

    move-object/from16 v1, p27

    .line 28
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->y:Ljava/util/List;

    move-object/from16 v1, p28

    .line 29
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->z:Ljava/lang/String;

    move-object/from16 v1, p29

    .line 30
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->A:Ljava/lang/String;

    move/from16 v1, p30

    .line 31
    iput v1, v0, Lcom/php25/PDownload/DownloadFile;->B:I

    move-object/from16 v1, p31

    .line 32
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->C:Ljava/lang/String;

    move-object/from16 v1, p34

    .line 33
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->D:Ljava/lang/String;

    move-object/from16 v1, p35

    .line 34
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->E:Ljava/lang/String;

    move-object/from16 v1, p36

    .line 35
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->F:Ljava/lang/String;

    move-object/from16 v1, p37

    .line 36
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->G:Ljava/lang/String;

    move/from16 v1, p38

    .line 37
    iput-boolean v1, v0, Lcom/php25/PDownload/DownloadFile;->H:Z

    move-object/from16 v1, p39

    .line 38
    iput-object v1, v0, Lcom/php25/PDownload/DownloadFile;->I:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->C:Ljava/lang/String;

    return-object v0
.end method

.method public B()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->d:Ljava/lang/String;

    return-object v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->D:Ljava/lang/String;

    return-object v0
.end method

.method public D()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->E:Ljava/lang/String;

    return-object v0
.end method

.method public E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/php25/PDownload/DownloadFile;->u:Z

    return v0
.end method

.method public F()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/php25/PDownload/DownloadFile;->k:Z

    return v0
.end method

.method public G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/php25/PDownload/DownloadFile;->s:Z

    return v0
.end method

.method public H()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/php25/PDownload/DownloadFile;->l:Z

    return v0
.end method

.method public I()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/php25/PDownload/DownloadFile;->H:Z

    return v0
.end method

.method public J(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->h:Ljava/lang/String;

    return-void
.end method

.method public K(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/php25/PDownload/DownloadFile;->u:Z

    return-void
.end method

.method public L(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->e:Ljava/lang/String;

    return-void
.end method

.method public M(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/php25/PDownload/DownloadFile;->w:J

    return-void
.end method

.method public N(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->z:Ljava/lang/String;

    return-void
.end method

.method public O(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->m:Ljava/lang/String;

    return-void
.end method

.method public P(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->I:Ljava/lang/String;

    return-void
.end method

.method public Q(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/php25/PDownload/DownloadFile;->k:Z

    return-void
.end method

.method public R(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/php25/PDownload/DownloadFile;->s:Z

    return-void
.end method

.method public S(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->q:Ljava/lang/String;

    return-void
.end method

.method public T(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->r:Ljava/lang/String;

    return-void
.end method

.method public U(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->n:Ljava/lang/String;

    return-void
.end method

.method public V(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/php25/PDownload/DownloadFile;->l:Z

    return-void
.end method

.method public W(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->i:Ljava/lang/String;

    return-void
.end method

.method public X(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->F:Ljava/lang/String;

    return-void
.end method

.method public Y(Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->b:Ljava/lang/Long;

    return-void
.end method

.method public Z(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/php25/PDownload/DownloadFile;->x:J

    return-void
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->h:Ljava/lang/String;

    return-object v0
.end method

.method public a0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/php25/PDownload/DownloadFile;->v:J

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->f:Ljava/lang/String;

    return-void
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/php25/PDownload/DownloadFile;->w:J

    return-wide v0
.end method

.method public c0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/php25/PDownload/DownloadFile;->H:Z

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->z:Ljava/lang/String;

    return-object v0
.end method

.method public d0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->o:Ljava/lang/String;

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->m:Ljava/lang/String;

    return-object v0
.end method

.method public e0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->t:Ljava/lang/String;

    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->I:Ljava/lang/String;

    return-object v0
.end method

.method public f0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->p:Ljava/lang/String;

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->q:Ljava/lang/String;

    return-object v0
.end method

.method public g0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/php25/PDownload/DownloadFile;->B:I

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->r:Ljava/lang/String;

    return-object v0
.end method

.method public h0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->A:Ljava/lang/String;

    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->n:Ljava/lang/String;

    return-object v0
.end method

.method public i0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->g:Ljava/lang/String;

    return-void
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/php25/PDownload/DownloadFile;->l:Z

    return v0
.end method

.method public j0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/php25/PDownload/DownloadFile;->J:I

    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->i:Ljava/lang/String;

    return-object v0
.end method

.method public k0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->G:Ljava/lang/String;

    return-void
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->F:Ljava/lang/String;

    return-object v0
.end method

.method public l0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->c:Ljava/lang/String;

    return-void
.end method

.method public m()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public m0(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TipBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->y:Ljava/util/List;

    return-void
.end method

.method public n()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/php25/PDownload/DownloadFile;->x:J

    return-wide v0
.end method

.method public n0(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->j:Ljava/lang/Integer;

    return-void
.end method

.method public o()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/php25/PDownload/DownloadFile;->v:J

    return-wide v0
.end method

.method public o0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->C:Ljava/lang/String;

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->o:Ljava/lang/String;

    return-object v0
.end method

.method public p0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->d:Ljava/lang/String;

    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->t:Ljava/lang/String;

    return-object v0
.end method

.method public q0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->D:Ljava/lang/String;

    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->p:Ljava/lang/String;

    return-object v0
.end method

.method public r0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/php25/PDownload/DownloadFile;->E:Ljava/lang/String;

    return-void
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/php25/PDownload/DownloadFile;->B:I

    return v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->A:Ljava/lang/String;

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->g:Ljava/lang/String;

    return-object v0
.end method

.method public v()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/php25/PDownload/DownloadFile;->J:I

    return v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->G:Ljava/lang/String;

    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->c:Ljava/lang/String;

    return-object v0
.end method

.method public y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TipBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->y:Ljava/util/List;

    return-object v0
.end method

.method public z()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/php25/PDownload/DownloadFile;->j:Ljava/lang/Integer;

    return-object v0
.end method
