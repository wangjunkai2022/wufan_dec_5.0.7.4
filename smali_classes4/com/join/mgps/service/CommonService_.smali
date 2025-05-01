.class public final Lcom/join/mgps/service/CommonService_;
.super Lcom/join/mgps/service/CommonService;
.source "CommonService_.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/service/CommonService_$h2;
    }
.end annotation


# instance fields
.field private final A1:Landroid/content/IntentFilter;

.field private final A2:Landroid/content/IntentFilter;

.field private final B1:Landroid/content/BroadcastReceiver;

.field private final B2:Landroid/content/BroadcastReceiver;

.field private final C1:Landroid/content/IntentFilter;

.field private final C2:Landroid/content/IntentFilter;

.field private final D1:Landroid/content/BroadcastReceiver;

.field private final D2:Landroid/content/BroadcastReceiver;

.field private final E1:Landroid/content/IntentFilter;

.field private final E2:Landroid/content/IntentFilter;

.field private final F1:Landroid/content/BroadcastReceiver;

.field private final F2:Landroid/content/BroadcastReceiver;

.field private final G1:Landroid/content/IntentFilter;

.field private final G2:Landroid/content/IntentFilter;

.field private final H1:Landroid/content/BroadcastReceiver;

.field private final H2:Landroid/content/BroadcastReceiver;

.field private final I1:Landroid/content/IntentFilter;

.field private final I2:Landroid/content/IntentFilter;

.field private final J1:Landroid/content/BroadcastReceiver;

.field private final J2:Landroid/content/BroadcastReceiver;

.field private final K1:Landroid/content/IntentFilter;

.field private final K2:Landroid/content/IntentFilter;

.field private final L1:Landroid/content/BroadcastReceiver;

.field private final L2:Landroid/content/BroadcastReceiver;

.field private final M1:Landroid/content/IntentFilter;

.field private final M2:Landroid/content/IntentFilter;

.field private final N1:Landroid/content/BroadcastReceiver;

.field private final N2:Landroid/content/BroadcastReceiver;

.field private final O1:Landroid/content/IntentFilter;

.field private final O2:Landroid/content/IntentFilter;

.field private final P1:Landroid/content/BroadcastReceiver;

.field private final P2:Landroid/content/BroadcastReceiver;

.field private final Q1:Landroid/content/IntentFilter;

.field private final Q2:Landroid/content/IntentFilter;

.field private final R1:Landroid/content/BroadcastReceiver;

.field private final R2:Landroid/content/BroadcastReceiver;

.field private final S1:Landroid/content/IntentFilter;

.field private final S2:Landroid/content/IntentFilter;

.field private final T1:Landroid/content/BroadcastReceiver;

.field private final T2:Landroid/content/BroadcastReceiver;

.field private final U1:Landroid/content/IntentFilter;

.field private final U2:Landroid/content/IntentFilter;

.field private final V1:Landroid/content/BroadcastReceiver;

.field private final V2:Landroid/content/BroadcastReceiver;

.field private final W1:Landroid/content/IntentFilter;

.field private final W2:Landroid/content/IntentFilter;

.field private final X1:Landroid/content/BroadcastReceiver;

.field private final X2:Landroid/content/BroadcastReceiver;

.field private final Y1:Landroid/content/IntentFilter;

.field private final Y2:Landroid/content/IntentFilter;

.field private final Z:Landroid/content/IntentFilter;

.field private final Z1:Landroid/content/BroadcastReceiver;

.field private final Z2:Landroid/content/BroadcastReceiver;

.field private final a2:Landroid/content/IntentFilter;

.field private final a3:Landroid/content/IntentFilter;

.field private final b2:Landroid/content/BroadcastReceiver;

.field private final b3:Landroid/content/BroadcastReceiver;

.field private final c2:Landroid/content/IntentFilter;

.field private final c3:Landroid/content/IntentFilter;

.field private final d2:Landroid/content/BroadcastReceiver;

.field private final d3:Landroid/content/BroadcastReceiver;

.field private final e2:Landroid/content/IntentFilter;

.field private final e3:Landroid/content/IntentFilter;

.field private final f2:Landroid/content/BroadcastReceiver;

.field private final f3:Landroid/content/BroadcastReceiver;

.field private final g2:Landroid/content/IntentFilter;

.field private final h2:Landroid/content/BroadcastReceiver;

.field private final i2:Landroid/content/IntentFilter;

.field private final j2:Landroid/content/BroadcastReceiver;

.field private final k2:Landroid/content/IntentFilter;

.field private final l2:Landroid/content/BroadcastReceiver;

.field private final m2:Landroid/content/IntentFilter;

.field private final n2:Landroid/content/BroadcastReceiver;

.field private final o2:Landroid/content/IntentFilter;

.field private final p0:Landroid/content/BroadcastReceiver;

.field private final p1:Landroid/content/IntentFilter;

.field private final p2:Landroid/content/BroadcastReceiver;

.field private final q2:Landroid/content/IntentFilter;

.field private final r2:Landroid/content/BroadcastReceiver;

.field private final s2:Landroid/content/IntentFilter;

.field private final t2:Landroid/content/BroadcastReceiver;

.field private final u2:Landroid/content/IntentFilter;

.field private final v1:Landroid/content/BroadcastReceiver;

.field private final v2:Landroid/content/BroadcastReceiver;

.field private final w2:Landroid/content/IntentFilter;

.field private final x2:Landroid/content/BroadcastReceiver;

.field private final y2:Landroid/content/IntentFilter;

.field private final z2:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/service/CommonService;-><init>()V

    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->Z:Landroid/content/IntentFilter;

    .line 3
    new-instance v0, Lcom/join/mgps/service/CommonService_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$k;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->p0:Landroid/content/BroadcastReceiver;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->p1:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/service/CommonService_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$v;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->v1:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->A1:Landroid/content/IntentFilter;

    .line 7
    new-instance v0, Lcom/join/mgps/service/CommonService_$g0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$g0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->B1:Landroid/content/BroadcastReceiver;

    .line 8
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->C1:Landroid/content/IntentFilter;

    .line 9
    new-instance v0, Lcom/join/mgps/service/CommonService_$r0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$r0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->D1:Landroid/content/BroadcastReceiver;

    .line 10
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->E1:Landroid/content/IntentFilter;

    .line 11
    new-instance v0, Lcom/join/mgps/service/CommonService_$c1;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$c1;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->F1:Landroid/content/BroadcastReceiver;

    .line 12
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->G1:Landroid/content/IntentFilter;

    .line 13
    new-instance v0, Lcom/join/mgps/service/CommonService_$n1;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$n1;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->H1:Landroid/content/BroadcastReceiver;

    .line 14
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->I1:Landroid/content/IntentFilter;

    .line 15
    new-instance v0, Lcom/join/mgps/service/CommonService_$y1;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$y1;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->J1:Landroid/content/BroadcastReceiver;

    .line 16
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->K1:Landroid/content/IntentFilter;

    .line 17
    new-instance v0, Lcom/join/mgps/service/CommonService_$f2;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$f2;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->L1:Landroid/content/BroadcastReceiver;

    .line 18
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->M1:Landroid/content/IntentFilter;

    .line 19
    new-instance v0, Lcom/join/mgps/service/CommonService_$g2;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$g2;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->N1:Landroid/content/BroadcastReceiver;

    .line 20
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->O1:Landroid/content/IntentFilter;

    .line 21
    new-instance v0, Lcom/join/mgps/service/CommonService_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$a;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->P1:Landroid/content/BroadcastReceiver;

    .line 22
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->Q1:Landroid/content/IntentFilter;

    .line 23
    new-instance v0, Lcom/join/mgps/service/CommonService_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$b;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->R1:Landroid/content/BroadcastReceiver;

    .line 24
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->S1:Landroid/content/IntentFilter;

    .line 25
    new-instance v0, Lcom/join/mgps/service/CommonService_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$c;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->T1:Landroid/content/BroadcastReceiver;

    .line 26
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->U1:Landroid/content/IntentFilter;

    .line 27
    new-instance v0, Lcom/join/mgps/service/CommonService_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$d;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->V1:Landroid/content/BroadcastReceiver;

    .line 28
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->W1:Landroid/content/IntentFilter;

    .line 29
    new-instance v0, Lcom/join/mgps/service/CommonService_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$e;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->X1:Landroid/content/BroadcastReceiver;

    .line 30
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->Y1:Landroid/content/IntentFilter;

    .line 31
    new-instance v0, Lcom/join/mgps/service/CommonService_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$f;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->Z1:Landroid/content/BroadcastReceiver;

    .line 32
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->a2:Landroid/content/IntentFilter;

    .line 33
    new-instance v0, Lcom/join/mgps/service/CommonService_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$g;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->b2:Landroid/content/BroadcastReceiver;

    .line 34
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->c2:Landroid/content/IntentFilter;

    .line 35
    new-instance v0, Lcom/join/mgps/service/CommonService_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$h;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->d2:Landroid/content/BroadcastReceiver;

    .line 36
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->e2:Landroid/content/IntentFilter;

    .line 37
    new-instance v0, Lcom/join/mgps/service/CommonService_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$i;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->f2:Landroid/content/BroadcastReceiver;

    .line 38
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->g2:Landroid/content/IntentFilter;

    .line 39
    new-instance v0, Lcom/join/mgps/service/CommonService_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$j;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->h2:Landroid/content/BroadcastReceiver;

    .line 40
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->i2:Landroid/content/IntentFilter;

    .line 41
    new-instance v0, Lcom/join/mgps/service/CommonService_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$l;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->j2:Landroid/content/BroadcastReceiver;

    .line 42
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->k2:Landroid/content/IntentFilter;

    .line 43
    new-instance v0, Lcom/join/mgps/service/CommonService_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$m;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->l2:Landroid/content/BroadcastReceiver;

    .line 44
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->m2:Landroid/content/IntentFilter;

    .line 45
    new-instance v0, Lcom/join/mgps/service/CommonService_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$n;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->n2:Landroid/content/BroadcastReceiver;

    .line 46
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->o2:Landroid/content/IntentFilter;

    .line 47
    new-instance v0, Lcom/join/mgps/service/CommonService_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$o;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->p2:Landroid/content/BroadcastReceiver;

    .line 48
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->q2:Landroid/content/IntentFilter;

    .line 49
    new-instance v0, Lcom/join/mgps/service/CommonService_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$p;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->r2:Landroid/content/BroadcastReceiver;

    .line 50
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->s2:Landroid/content/IntentFilter;

    .line 51
    new-instance v0, Lcom/join/mgps/service/CommonService_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$q;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->t2:Landroid/content/BroadcastReceiver;

    .line 52
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->u2:Landroid/content/IntentFilter;

    .line 53
    new-instance v0, Lcom/join/mgps/service/CommonService_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$r;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->v2:Landroid/content/BroadcastReceiver;

    .line 54
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->w2:Landroid/content/IntentFilter;

    .line 55
    new-instance v0, Lcom/join/mgps/service/CommonService_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$s;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->x2:Landroid/content/BroadcastReceiver;

    .line 56
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->y2:Landroid/content/IntentFilter;

    .line 57
    new-instance v0, Lcom/join/mgps/service/CommonService_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$t;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->z2:Landroid/content/BroadcastReceiver;

    .line 58
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->A2:Landroid/content/IntentFilter;

    .line 59
    new-instance v0, Lcom/join/mgps/service/CommonService_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$u;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->B2:Landroid/content/BroadcastReceiver;

    .line 60
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->C2:Landroid/content/IntentFilter;

    .line 61
    new-instance v0, Lcom/join/mgps/service/CommonService_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$w;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->D2:Landroid/content/BroadcastReceiver;

    .line 62
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->E2:Landroid/content/IntentFilter;

    .line 63
    new-instance v0, Lcom/join/mgps/service/CommonService_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$x;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->F2:Landroid/content/BroadcastReceiver;

    .line 64
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->G2:Landroid/content/IntentFilter;

    .line 65
    new-instance v0, Lcom/join/mgps/service/CommonService_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$y;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->H2:Landroid/content/BroadcastReceiver;

    .line 66
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->I2:Landroid/content/IntentFilter;

    .line 67
    new-instance v0, Lcom/join/mgps/service/CommonService_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$z;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->J2:Landroid/content/BroadcastReceiver;

    .line 68
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->K2:Landroid/content/IntentFilter;

    .line 69
    new-instance v0, Lcom/join/mgps/service/CommonService_$a0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$a0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->L2:Landroid/content/BroadcastReceiver;

    .line 70
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->M2:Landroid/content/IntentFilter;

    .line 71
    new-instance v0, Lcom/join/mgps/service/CommonService_$b0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$b0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->N2:Landroid/content/BroadcastReceiver;

    .line 72
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->O2:Landroid/content/IntentFilter;

    .line 73
    new-instance v0, Lcom/join/mgps/service/CommonService_$c0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$c0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->P2:Landroid/content/BroadcastReceiver;

    .line 74
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->Q2:Landroid/content/IntentFilter;

    .line 75
    new-instance v0, Lcom/join/mgps/service/CommonService_$d0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$d0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->R2:Landroid/content/BroadcastReceiver;

    .line 76
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->S2:Landroid/content/IntentFilter;

    .line 77
    new-instance v0, Lcom/join/mgps/service/CommonService_$e0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$e0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->T2:Landroid/content/BroadcastReceiver;

    .line 78
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->U2:Landroid/content/IntentFilter;

    .line 79
    new-instance v0, Lcom/join/mgps/service/CommonService_$f0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$f0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->V2:Landroid/content/BroadcastReceiver;

    .line 80
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->W2:Landroid/content/IntentFilter;

    .line 81
    new-instance v0, Lcom/join/mgps/service/CommonService_$h0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$h0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->X2:Landroid/content/BroadcastReceiver;

    .line 82
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->Y2:Landroid/content/IntentFilter;

    .line 83
    new-instance v0, Lcom/join/mgps/service/CommonService_$i0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$i0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->Z2:Landroid/content/BroadcastReceiver;

    .line 84
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->a3:Landroid/content/IntentFilter;

    .line 85
    new-instance v0, Lcom/join/mgps/service/CommonService_$j0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$j0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->b3:Landroid/content/BroadcastReceiver;

    .line 86
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->c3:Landroid/content/IntentFilter;

    .line 87
    new-instance v0, Lcom/join/mgps/service/CommonService_$k0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$k0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->d3:Landroid/content/BroadcastReceiver;

    .line 88
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->e3:Landroid/content/IntentFilter;

    .line 89
    new-instance v0, Lcom/join/mgps/service/CommonService_$l0;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$l0;-><init>(Lcom/join/mgps/service/CommonService_;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService_;->f3:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A2(Lcom/join/mgps/service/CommonService_;Lcom/join/mgps/dto/CollectionBeanSub;ZZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p7}, Lcom/join/mgps/service/CommonService;->J1(Lcom/join/mgps/dto/CollectionBeanSub;ZZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    return-void
.end method

.method static synthetic B2(Lcom/join/mgps/service/CommonService_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->q1(Ljava/util/List;)V

    return-void
.end method

.method static synthetic C2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->x()V

    return-void
.end method

.method static synthetic D2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->y(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic E2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->e()V

    return-void
.end method

.method static synthetic F2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/join/mgps/service/CommonService;->D(Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    return-void
.end method

.method static synthetic G2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->a0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic H2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/service/CommonService;->Z1(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic I2(Lcom/join/mgps/service/CommonService_;ZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/service/CommonService;->E(ZZLjava/lang/String;)V

    return-void
.end method

.method static synthetic J2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->s1()V

    return-void
.end method

.method static synthetic K2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->s0()V

    return-void
.end method

.method static synthetic L2(Lcom/join/mgps/service/CommonService_;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->x0(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic M2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p6}, Lcom/join/mgps/service/CommonService;->F1(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    return-void
.end method

.method static synthetic N2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/service/CommonService;->U(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic O2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/service/CommonService;->L1(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic P2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->P1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Q2(Lcom/join/mgps/service/CommonService_;Lcom/join/mgps/dto/SharePostRequest;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->B1(Lcom/join/mgps/dto/SharePostRequest;)V

    return-void
.end method

.method private R2()V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->d:Lcom/join/mgps/Util/b;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->Z:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.appfinish"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->p1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.action_login_701"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->A1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.action_local_battle_finish"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->C1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.broadcast.action_insufficient_storage"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->E1:Landroid/content/IntentFilter;

    const-string v1, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->E1:Landroid/content/IntentFilter;

    const-string v1, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->E1:Landroid/content/IntentFilter;

    const-string v1, "android.net.wifi.SCAN_RESULTS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->E1:Landroid/content/IntentFilter;

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->G1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.action_login_success"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->G1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.action_update_user_purchase_info"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->I1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.action_reward_anim"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->K1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->M1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->M1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.refreshPurchasedGame"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->O1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.gameout"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->Q1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.gamestart15"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->S1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.gamestart160"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->U1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.gamestartbattle15"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->W1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.gamestartlocalbattle"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->Y1:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.gameendlocalbattle"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->a2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.netbattlematchefficiency"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->c2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.playtime"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->e2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emulogcat"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->g2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.psp.countdown"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->i2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.psp.limitpopup"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->k2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.psp.limitplay"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->m2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.psp.limitmember"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->o2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.psp.limitquit"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->q2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.showvippopup"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->s2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.onclickVippopup"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->u2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.uesVippopup"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->w2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.onclickFunction"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->y2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.shareScreenshot"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->A2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.openGoldfinger"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->C2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.openKeyskill"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->E2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.selectLevel"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->G2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.NotpromptVippopup"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->I2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.exitVippopup"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->K2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.gameMessage"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->M2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->O2:Landroid/content/IntentFilter;

    const-string v1, "com.wufun.share.image"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->Q2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.adInfo"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->S2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.gamePlayTimes"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->U2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.ps2.gameout"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->W2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.3ds.gameout"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->Y2:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.overmind.sp.write.introduction.show"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->a3:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.endgame_record_upload"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->c3:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.overmind.sp.write.mod"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->e3:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.show.hide"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method public static S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService_$h2;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method static synthetic c2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Lcom/join/mgps/dto/PayOrderInfo;Lcom/wufan/user/service/protobuf/n0;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/join/mgps/service/CommonService;->N1(Ljava/lang/String;Lcom/join/mgps/dto/PayOrderInfo;Lcom/wufan/user/service/protobuf/n0;ZLjava/lang/String;)V

    return-void
.end method

.method static synthetic d2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->Q1()V

    return-void
.end method

.method static synthetic e2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->W()V

    return-void
.end method

.method static synthetic g2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->i1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->k1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic i2(Lcom/join/mgps/service/CommonService_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->v(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic j2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p11}, Lcom/join/mgps/service/CommonService;->T(Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    return-void
.end method

.method static synthetic k2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/service/CommonService;->b0(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method static synthetic l2(Lcom/join/mgps/service/CommonService_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->I0(I)V

    return-void
.end method

.method static synthetic m2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->f0()V

    return-void
.end method

.method static synthetic n2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->g0()V

    return-void
.end method

.method static synthetic o2(Lcom/join/mgps/service/CommonService_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->h0(I)V

    return-void
.end method

.method static synthetic p2(Lcom/join/mgps/service/CommonService_;Lcom/join/mgps/dto/CollectionBeanSub;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/service/CommonService;->I1(Lcom/join/mgps/dto/CollectionBeanSub;Z)V

    return-void
.end method

.method static synthetic q2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->e0()V

    return-void
.end method

.method static synthetic r2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->V()V

    return-void
.end method

.method static synthetic s2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->Y1()V

    return-void
.end method

.method static synthetic t2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->c0()V

    return-void
.end method

.method static synthetic u2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->Q()V

    return-void
.end method

.method static synthetic v2(Lcom/join/mgps/service/CommonService_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/service/CommonService;->u(Ljava/util/List;)V

    return-void
.end method

.method static synthetic w2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->d()V

    return-void
.end method

.method static synthetic x2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->j1()V

    return-void
.end method

.method static synthetic y2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->d0()V

    return-void
.end method

.method static synthetic z2(Lcom/join/mgps/service/CommonService_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->Z()V

    return-void
.end method


# virtual methods
.method B1(Lcom/join/mgps/dto/SharePostRequest;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$w0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$w0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/SharePostRequest;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method D(Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 12

    .line 1
    new-instance v11, Lcom/join/mgps/service/CommonService_$z1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v11

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move/from16 v9, p4

    move-object/from16 v10, p5

    invoke-direct/range {v0 .. v10}, Lcom/join/mgps/service/CommonService_$z1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    invoke-static {v11}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method E(ZZLjava/lang/String;)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/service/CommonService_$c2;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/service/CommonService_$c2;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;ZZLjava/lang/String;)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method F1(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/service/CommonService_$s0;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/service/CommonService_$s0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v8, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/service/CommonService_$n0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/service/CommonService_$n0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$f1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$f1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method I1(Lcom/join/mgps/dto/CollectionBeanSub;Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/service/CommonService_$o0;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/service/CommonService_$o0;-><init>(Lcom/join/mgps/service/CommonService_;Lcom/join/mgps/dto/CollectionBeanSub;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method J1(Lcom/join/mgps/dto/CollectionBeanSub;ZZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/service/CommonService_$p0;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/service/CommonService_$p0;-><init>(Lcom/join/mgps/service/CommonService_;Lcom/join/mgps/dto/CollectionBeanSub;ZZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    const-string v0, ""

    const-wide/16 v1, 0x0

    invoke-static {v0, v9, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method L1(Ljava/lang/String;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/service/CommonService_$u0;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/service/CommonService_$u0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method N1(Ljava/lang/String;Lcom/join/mgps/dto/PayOrderInfo;Lcom/wufan/user/service/protobuf/n0;ZLjava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$m0;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$m0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Lcom/join/mgps/dto/PayOrderInfo;Lcom/wufan/user/service/protobuf/n0;ZLjava/lang/String;)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v7, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method P1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/service/CommonService_$v0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/service/CommonService_$v0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$o1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$o1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Q1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$x0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$x0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method T(Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move/from16 v8, p3

    move-wide/from16 v9, p4

    move-object/from16 v11, p6

    move/from16 v12, p7

    move/from16 v13, p8

    move/from16 v14, p9

    move/from16 v15, p10

    move-object/from16 v16, p11

    .line 1
    new-instance v17, Lcom/join/mgps/service/CommonService_$d1;

    move-object/from16 v0, v17

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    invoke-direct/range {v0 .. v16}, Lcom/join/mgps/service/CommonService_$d1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    invoke-static/range {v17 .. v17}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method U(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/service/CommonService_$t0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/service/CommonService_$t0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string p1, ""

    const-wide/16 p2, 0xc8

    invoke-static {p1, v0, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method V()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$k1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$k1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method W()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$y0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$y0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Y1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$l1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$l1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Z()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$t1;

    const-string v2, ""

    const-wide/16 v3, 0x1f4

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$t1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Z1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/service/CommonService_$b2;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/service/CommonService_$b2;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method a0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$a2;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$a2;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method b0(Ljava/lang/String;ILjava/lang/String;)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/service/CommonService_$e1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/service/CommonService_$e1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method c0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$m1;

    const-string v2, ""

    const-wide/16 v3, 0x1388

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$m1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method d()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$q1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$q1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method d0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$s1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$s1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$x1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$x1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$j1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$j1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method f0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$g1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$g1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method g0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$h1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$h1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method h0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$i1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$i1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i1(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$z0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$z0;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method j1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$r1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$r1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method k1(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$a1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$a1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/service/CommonService_;->R2()V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->onCreate()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->p0:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->Z:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->v1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->p1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->B1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->A1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->D1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->C1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->F1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->E1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 8
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->H1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->G1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->J1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->I1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 10
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->L1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->K1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->N1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->M1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 12
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->P1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->O1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 13
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->R1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->Q1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 14
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->T1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->S1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 15
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->V1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->U1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 16
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->X1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->W1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 17
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->Z1:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->Y1:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 18
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->b2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->a2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 19
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->d2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->c2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 20
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->f2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->e2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 21
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->h2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->g2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 22
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->j2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->i2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 23
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->l2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->k2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 24
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->n2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->m2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 25
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->p2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->o2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 26
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->r2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->q2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 27
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->t2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->s2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 28
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->v2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->u2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 29
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->x2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->w2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 30
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->z2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->y2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 31
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->B2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->A2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 32
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->D2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->C2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 33
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->F2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->E2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 34
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->H2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->G2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 35
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->J2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->I2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 36
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->L2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->K2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 37
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->N2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->M2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 38
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->P2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->O2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 39
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->R2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->Q2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 40
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->T2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->S2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 41
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->V2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->U2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 42
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->X2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->W2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 43
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->Z2:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->Y2:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 44
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->b3:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->a3:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 45
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->d3:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->c3:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 46
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->f3:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_;->e3:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->p0:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->v1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->B1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->D1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->F1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->H1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->J1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->L1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->N1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->P1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->R1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->T1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->V1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->X1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->Z1:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->b2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->d2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->f2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->h2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->j2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->l2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->n2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 23
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->p2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->r2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 25
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->t2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->v2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->x2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->z2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->B2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 30
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->D2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 31
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->F2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 32
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->H2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 33
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->J2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 34
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->L2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 35
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->N2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 36
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->P2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 37
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->R2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 38
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->T2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 39
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->V2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 40
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->X2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 41
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->Z2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 42
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->b3:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 43
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->d3:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 44
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_;->f3:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 45
    invoke-super {p0}, Lcom/join/mgps/service/CommonService;->onDestroy()V

    return-void
.end method

.method q1(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/AppBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$u1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$u1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method s0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$e2;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$e2;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method s1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$d2;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$d2;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method u(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$p1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$p1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method v(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$b1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$b1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method x()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/service/CommonService_$v1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_$v1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method x0(Landroid/content/Intent;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/service/CommonService_$q0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/service/CommonService_$q0;-><init>(Lcom/join/mgps/service/CommonService_;Landroid/content/Intent;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/service/CommonService_$w1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/service/CommonService_$w1;-><init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
