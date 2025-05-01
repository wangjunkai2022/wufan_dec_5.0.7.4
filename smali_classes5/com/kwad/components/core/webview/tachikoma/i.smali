.class public Lcom/kwad/components/core/webview/tachikoma/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/e/e/f;
.implements Lcom/kwad/sdk/components/o;
.implements Lcom/kwad/sdk/core/view/b;
.implements Lcom/kwad/sdk/core/webview/d/a/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/tachikoma/i$a;
    }
.end annotation


# static fields
.field private static ZN:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/kwad/components/core/webview/tachikoma/c/e;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private Fe:J

.field private Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

.field private Wm:Lcom/kwad/sdk/core/download/d;

.field private ZA:Lcom/kwad/components/core/webview/jshandler/av;

.field private ZB:Lcom/kwad/sdk/core/view/d;

.field private ZC:Landroid/widget/TextView;

.field private ZD:Z

.field private ZE:Z

.field private ZF:Z

.field private ZG:Z

.field private ZH:Z

.field private ZI:I

.field private ZJ:J

.field private ZK:J

.field private ZL:J

.field private ZM:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private ZO:I

.field private ZP:I

.field private ZQ:Z

.field private ZR:Ljava/lang/String;

.field private ZS:Ljava/lang/String;

.field protected ZU:Lcom/kwad/sdk/core/webview/e;

.field private ZV:Lcom/kwad/components/core/webview/tachikoma/i$a;

.field private ZW:Lcom/kwad/sdk/components/p;

.field private ZX:Lcom/kwad/sdk/components/j;

.field private final ZY:Ljava/lang/Runnable;

.field private final ZZ:Ljava/lang/Runnable;

.field private Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

.field protected Zu:Lcom/kwad/components/core/webview/tachikoma/j;

.field private Zv:Lcom/kwad/sdk/core/webview/c/g;

.field private Zw:Lcom/kwad/components/core/n/a/d/c;

.field private Zx:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field private Zy:Lcom/kwad/sdk/components/r;

.field private Zz:Lcom/kwad/components/core/webview/tachikoma/a/p;

.field private cQ:Lcom/kwad/components/core/webview/jshandler/aw;

.field private final gO:Lcom/kwad/components/core/video/l;

.field private mActivity:Landroid/app/Activity;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

.field protected final mContext:Landroid/content/Context;

.field private final wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

.field protected xt:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/kwad/components/core/webview/tachikoma/i;->ZN:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(JLandroid/content/Context;)V
    .locals 3

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZD:Z

    .line 27
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZE:Z

    .line 28
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZF:Z

    .line 29
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZG:Z

    .line 30
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZH:Z

    .line 31
    iput v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    const-wide/16 v1, -0x1

    .line 32
    iput-wide v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->xt:J

    const/16 v1, 0x3e8

    .line 33
    iput v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZO:I

    .line 34
    iput v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZP:I

    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZQ:Z

    .line 36
    new-instance v0, Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/e;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    .line 37
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$20;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$20;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZV:Lcom/kwad/components/core/webview/tachikoma/i$a;

    .line 38
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$22;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$22;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZW:Lcom/kwad/sdk/components/p;

    .line 39
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$23;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$23;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZX:Lcom/kwad/sdk/components/j;

    .line 40
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$25;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$25;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZY:Ljava/lang/Runnable;

    .line 41
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$26;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$26;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZZ:Ljava/lang/Runnable;

    .line 42
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$17;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$17;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->gO:Lcom/kwad/components/core/video/l;

    .line 43
    iput-object p3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    .line 44
    iput-wide p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->xt:J

    .line 45
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/y;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/y;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/core/webview/tachikoma/i;-><init>(Landroid/content/Context;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 3

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 47
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZD:Z

    .line 48
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZE:Z

    .line 49
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZF:Z

    .line 50
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZG:Z

    .line 51
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZH:Z

    .line 52
    iput v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    const-wide/16 v1, -0x1

    .line 53
    iput-wide v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->xt:J

    const/16 v1, 0x3e8

    .line 54
    iput v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZO:I

    .line 55
    iput v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZP:I

    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZQ:Z

    .line 57
    new-instance v0, Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/e;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    .line 58
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$20;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$20;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZV:Lcom/kwad/components/core/webview/tachikoma/i$a;

    .line 59
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$22;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$22;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZW:Lcom/kwad/sdk/components/p;

    .line 60
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$23;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$23;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZX:Lcom/kwad/sdk/components/j;

    .line 61
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$25;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$25;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZY:Ljava/lang/Runnable;

    .line 62
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$26;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$26;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZZ:Ljava/lang/Runnable;

    .line 63
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$17;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$17;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->gO:Lcom/kwad/components/core/video/l;

    .line 64
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    .line 65
    iput p2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZO:I

    .line 66
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/y;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/y;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    .line 67
    iput p3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZP:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZD:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZE:Z

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZF:Z

    .line 6
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZG:Z

    .line 7
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZH:Z

    .line 8
    iput v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    const-wide/16 v1, -0x1

    .line 9
    iput-wide v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->xt:J

    const/16 v3, 0x3e8

    .line 10
    iput v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZO:I

    .line 11
    iput v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZP:I

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZQ:Z

    .line 13
    new-instance v0, Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/e;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    .line 14
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$20;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$20;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZV:Lcom/kwad/components/core/webview/tachikoma/i$a;

    .line 15
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$22;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$22;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZW:Lcom/kwad/sdk/components/p;

    .line 16
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$23;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$23;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZX:Lcom/kwad/sdk/components/j;

    .line 17
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$25;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$25;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZY:Ljava/lang/Runnable;

    .line 18
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$26;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$26;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZZ:Ljava/lang/Runnable;

    .line 19
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$17;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i$17;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->gO:Lcom/kwad/components/core/video/l;

    .line 20
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    .line 21
    iput-wide v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->xt:J

    .line 22
    iput v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZO:I

    .line 23
    iput-boolean p2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZQ:Z

    .line 24
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/y;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/y;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Fe:J

    return-wide p1
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Landroid/app/Activity;)Landroid/app/Activity;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mActivity:Landroid/app/Activity;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/core/webview/tachikoma/c/e;)Lcom/kwad/components/core/webview/tachikoma/c/e;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;)Lcom/kwad/components/core/webview/tachikoma/i$a;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZV:Lcom/kwad/components/core/webview/tachikoma/i$a;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/components/i;
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->aC(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/components/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/core/webview/jshandler/aj$a;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->b(Lcom/kwad/components/core/webview/jshandler/aj$a;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->b(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/offline/api/tk/TKDownloadListener;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/components/offline/api/tk/TKDownloadListener;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->b(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/offline/api/tk/model/StyleTemplate;Lcom/kwad/components/core/webview/tachikoma/i$a;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;Lcom/kwad/components/core/webview/tachikoma/i$a;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Ljava/lang/String;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->aS(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Ljava/lang/Throwable;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->f(Ljava/lang/Throwable;)V

    return-void
.end method

.method private a(Lcom/kwad/components/offline/api/tk/TKDownloadListener;)V
    .locals 10

    .line 42
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tl()Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "no template"

    .line 43
    invoke-interface {p1, v0}, Lcom/kwad/components/offline/api/tk/TKDownloadListener;->onFailed(Ljava/lang/String;)V

    return-void

    .line 44
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/i;->isLocalDebugEnable()Z

    move-result v1

    if-nez v1, :cond_1

    .line 45
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/h;->tf()Lcom/kwad/components/core/webview/tachikoma/h;

    move-result-object v1

    iget-object v2, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    iget v3, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    invoke-virtual {v1, v2, v3}, Lcom/kwad/components/core/webview/tachikoma/h;->n(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/i;->isLocalDebugEnable()Z

    move-result v2

    if-nez v2, :cond_1

    .line 47
    iput-object v1, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->jsStr:Ljava/lang/String;

    const/4 v1, 0x4

    .line 48
    iput v1, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->tkSouce:I

    const-string v1, "TKLoadController"

    const-string v2, "\u4f7f\u7528TK\u6a21\u677f\u7f13\u5b58"

    .line 49
    invoke-static {v1, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-interface {p1, v0}, Lcom/kwad/components/offline/api/tk/TKDownloadListener;->onSuccess(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V

    return-void

    .line 51
    :cond_1
    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    iget-object v4, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    iget-object v5, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    iget-object v6, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateMd5:Ljava/lang/String;

    iget-object v7, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateUrl:Ljava/lang/String;

    iget v8, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    move-object v9, p1

    invoke-interface/range {v3 .. v9}, Lcom/kwad/components/core/n/a/d/c;->loadTkFileByTemplateId(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/kwad/components/offline/api/tk/TKDownloadListener;)V

    return-void
.end method

.method private a(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;Lcom/kwad/components/core/webview/tachikoma/i$a;)V
    .locals 8

    .line 52
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "addTKView mTKPlugin.getState(): "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    invoke-interface {v1}, Lcom/kwad/components/core/n/a/d/c;->getState()Lcom/kwad/components/offline/api/tk/ITkOfflineCompo$TKState;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TKLoadController"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    invoke-interface {v0}, Lcom/kwad/components/core/n/a/d/c;->getState()Lcom/kwad/components/offline/api/tk/ITkOfflineCompo$TKState;

    move-result-object v0

    sget-object v1, Lcom/kwad/components/offline/api/tk/ITkOfflineCompo$TKState;->SO_FAIL:Lcom/kwad/components/offline/api/tk/ITkOfflineCompo$TKState;

    if-ne v0, v1, :cond_1

    const-string p1, "so_fail"

    .line 55
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->aU(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 56
    invoke-interface {p2}, Lcom/kwad/components/core/webview/tachikoma/i$a;->onFailed()V

    :cond_0
    return-void

    .line 57
    :cond_1
    iget-object v0, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->jsStr:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "no_template"

    .line 58
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->aV(Ljava/lang/String;)V

    if-eqz p2, :cond_2

    .line 59
    invoke-interface {p2}, Lcom/kwad/components/core/webview/tachikoma/i$a;->onFailed()V

    :cond_2
    return-void

    .line 60
    :cond_3
    :try_start_0
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tp()V

    .line 61
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZK:J

    .line 62
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    iget-object v4, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    iget v5, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    iget v6, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->tkSouce:I

    iget-boolean v7, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZQ:Z

    invoke-interface/range {v2 .. v7}, Lcom/kwad/components/core/n/a/d/c;->a(Landroid/content/Context;Ljava/lang/String;IIZ)Lcom/kwad/sdk/components/r;

    move-result-object v0

    .line 63
    invoke-interface {v0}, Lcom/kwad/sdk/components/r;->getUniqId()I

    move-result v1

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-static {v1, v2}, Lcom/kwad/components/core/n/a/d/a/a;->a(ILcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 64
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZW:Lcom/kwad/sdk/components/p;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/r;->a(Lcom/kwad/sdk/components/p;)V

    .line 65
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZX:Lcom/kwad/sdk/components/j;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/r;->a(Lcom/kwad/sdk/components/j;)V

    .line 66
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    if-eqz v1, :cond_4

    .line 67
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v1

    const-string v2, "adStyle"

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-static {v3}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v3

    iget-object v3, v3, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v3}, Lcom/kwad/sdk/internal/api/SceneImpl;->getAdStyle()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v1

    const-string v2, "adScene"

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-static {v3}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v3

    iget-object v3, v3, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v3}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :cond_4
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    if-eqz v1, :cond_5

    .line 70
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v1

    const-string v2, "styleTemplate"

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    invoke-virtual {v3}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;->toJson()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_5
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v1

    const-string v2, "adCacheId"

    invoke-interface {v0}, Lcom/kwad/sdk/components/r;->getUniqId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v1

    const-string v2, "appId"

    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getAppId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v1

    const-string v2, "isDebug"

    sget-object v3, Lcom/kwad/components/core/a;->md:Ljava/lang/Boolean;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/r;->setCustomEnv(Ljava/util/Map;)V

    .line 75
    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zy:Lcom/kwad/sdk/components/r;

    .line 76
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    invoke-static {}, Lcom/kwad/sdk/core/c/b;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 77
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 78
    invoke-static {v2}, Lcom/kwad/sdk/c/a/a;->C(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 79
    invoke-static {v1}, Lcom/kwad/sdk/c/a/a;->aV(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    if-ne v1, v2, :cond_6

    const/4 v1, 0x1

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    .line 80
    :goto_0
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v2

    const-string v3, "isImmersiveMode"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :cond_7
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/r;->setCustomEnv(Ljava/util/Map;)V

    .line 82
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zv:Lcom/kwad/sdk/core/webview/c/g;

    if-eqz v1, :cond_8

    .line 83
    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/r;->b(Lcom/kwad/sdk/core/webview/c/g;)V

    .line 84
    :cond_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZK:J

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZL:J

    .line 85
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZJ:J

    .line 86
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tm()V

    .line 87
    invoke-direct {p0, v0}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;)V

    .line 88
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    iget-object v4, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 89
    invoke-interface {v4}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/kwad/components/core/n/a/d/c;->getJsBaseDir(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 90
    iget-object v2, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->jsStr:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/kwad/components/core/webview/tachikoma/i$21;

    invoke-direct {v3, p0, p2}, Lcom/kwad/components/core/webview/tachikoma/i$21;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/core/webview/tachikoma/i$a;)V

    invoke-interface {v0, v2, v1, v3}, Lcom/kwad/sdk/components/r;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/components/q;)V

    .line 91
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKContainer()Landroid/widget/FrameLayout;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 92
    iget-boolean v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZQ:Z

    if-eqz v2, :cond_9

    .line 93
    invoke-interface {v0}, Lcom/kwad/sdk/components/r;->getView()Landroid/view/View;

    move-result-object v0

    .line 94
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 96
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->c(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    return-void

    :catchall_0
    move-exception p1

    .line 97
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 98
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->f(Ljava/lang/Throwable;)V

    if-eqz p2, :cond_a

    .line 99
    invoke-interface {p2}, Lcom/kwad/components/core/webview/tachikoma/i$a;->onFailed()V

    :cond_a
    return-void
.end method

.method private a(Lcom/kwad/sdk/components/r;)V
    .locals 4

    .line 100
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 101
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 102
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-interface {v1, p1, v2}, Lcom/kwad/components/core/webview/tachikoma/j;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V

    .line 103
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/o;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/jshandler/o;-><init>()V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 104
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/p;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/jshandler/p;-><init>()V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 105
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/s;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/tachikoma/a/s;-><init>()V

    .line 106
    new-instance v2, Lcom/kwad/components/core/webview/tachikoma/i$3;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/webview/tachikoma/i$3;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/tachikoma/a/s;->a(Lcom/kwad/components/core/webview/tachikoma/a/s$a;)V

    .line 107
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 108
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-virtual {p0, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->c(Lcom/kwad/sdk/core/webview/b;)Lcom/kwad/components/core/webview/jshandler/ak;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 109
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/l;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/l;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 110
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/m;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/m;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 111
    new-instance v1, Lcom/kwad/sdk/core/webview/d/a;

    invoke-direct {v1}, Lcom/kwad/sdk/core/webview/d/a;-><init>()V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 112
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/f;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/tachikoma/a/f;-><init>()V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 113
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/x;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/tachikoma/a/x;-><init>()V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 114
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->nJ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 115
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v1, v2, v0, p0}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;)V

    .line 116
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZR:Ljava/lang/String;

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-virtual {v3}, Lcom/kwad/sdk/core/webview/b;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v3

    invoke-static {v3}, Lcom/kwad/sdk/core/response/b/b;->cR(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 117
    invoke-static {}, Lcom/kwad/components/core/e/e/g;->oQ()Lcom/kwad/components/core/e/e/g;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/kwad/components/core/e/e/g;->a(Lcom/kwad/components/core/e/e/f;)V

    .line 118
    :cond_1
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    goto :goto_1

    .line 119
    :cond_2
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/aa;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, p0, v3}, Lcom/kwad/components/core/webview/jshandler/aa;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;B)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 120
    :goto_1
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/z;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/z;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 121
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/k;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/tachikoma/a/k;-><init>()V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 122
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/ad;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/ad;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 123
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/ag;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/ag;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 124
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/ap;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/kwad/components/core/webview/jshandler/ap;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 125
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/ac;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/ac;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    .line 126
    new-instance v2, Lcom/kwad/components/core/webview/tachikoma/i$4;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/webview/tachikoma/i$4;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    .line 127
    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/jshandler/ac;->a(Lcom/kwad/components/core/webview/jshandler/ac$b;)V

    .line 128
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 129
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/aj;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    new-instance v3, Lcom/kwad/components/core/webview/tachikoma/i$5;

    invoke-direct {v3, p0}, Lcom/kwad/components/core/webview/tachikoma/i$5;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-direct {v1, v2, v3}, Lcom/kwad/components/core/webview/jshandler/aj;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/webview/jshandler/aj$b;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 130
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/aq;

    new-instance v2, Lcom/kwad/components/core/webview/tachikoma/i$6;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/webview/tachikoma/i$6;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/aq;-><init>(Lcom/kwad/components/core/webview/jshandler/aq$b;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 131
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/jshandler/aw;-><init>()V

    iput-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    .line 132
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 133
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-interface {v1, v2}, Lcom/kwad/components/core/webview/tachikoma/j;->a(Lcom/kwad/components/core/webview/jshandler/aw;)V

    .line 134
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/av;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/jshandler/av;-><init>()V

    iput-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZA:Lcom/kwad/components/core/webview/jshandler/av;

    .line 135
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 136
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/az;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-direct {v1, v2, v0}, Lcom/kwad/components/core/webview/jshandler/az;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;)V

    .line 137
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 138
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/p;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/tachikoma/a/p;-><init>()V

    iput-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zz:Lcom/kwad/components/core/webview/tachikoma/a/p;

    .line 139
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 140
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zz:Lcom/kwad/components/core/webview/tachikoma/a/p;

    invoke-interface {v1, v2}, Lcom/kwad/components/core/webview/tachikoma/j;->a(Lcom/kwad/components/core/webview/tachikoma/a/p;)V

    .line 141
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/a;

    new-instance v2, Lcom/kwad/components/core/webview/tachikoma/i$7;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/webview/tachikoma/i$7;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/a;-><init>(Lcom/kwad/components/core/webview/jshandler/a$b;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 142
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 143
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 144
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/l;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/tachikoma/a/l;-><init>()V

    .line 145
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 146
    new-instance v2, Lcom/kwad/components/core/webview/tachikoma/i$8;

    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v3

    invoke-direct {v2, p0, v3, v1}, Lcom/kwad/components/core/webview/tachikoma/i$8;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/webview/tachikoma/a/l;)V

    iput-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Wm:Lcom/kwad/sdk/core/download/d;

    .line 147
    invoke-static {}, Lcom/kwad/sdk/core/download/b;->DO()Lcom/kwad/sdk/core/download/b;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Wm:Lcom/kwad/sdk/core/download/d;

    .line 148
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kwad/sdk/core/download/b;->a(Lcom/kwad/sdk/core/download/c;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 149
    :cond_3
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/t;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/tachikoma/a/t;-><init>()V

    .line 150
    new-instance v2, Lcom/kwad/components/core/webview/tachikoma/i$9;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/webview/tachikoma/i$9;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/tachikoma/a/t;->a(Lcom/kwad/components/core/webview/tachikoma/a/t$a;)V

    .line 151
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 152
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/v;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/tachikoma/a/v;-><init>()V

    .line 153
    new-instance v2, Lcom/kwad/components/core/webview/tachikoma/i$10;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/webview/tachikoma/i$10;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/tachikoma/a/v;->a(Lcom/kwad/components/core/webview/tachikoma/a/v$a;)V

    .line 154
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 155
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/o;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/tachikoma/a/o;-><init>()V

    .line 156
    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 157
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v2, v1}, Lcom/kwad/components/core/webview/tachikoma/j;->a(Lcom/kwad/components/core/webview/tachikoma/a/o;)V

    .line 158
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/i$11;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/tachikoma/i$11;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 159
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/i$13;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/tachikoma/i$13;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 160
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/y;

    new-instance v2, Lcom/kwad/components/core/webview/tachikoma/i$14;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/webview/tachikoma/i$14;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/y;-><init>(Lcom/kwad/sdk/core/webview/d/a/b;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 161
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/i$15;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/tachikoma/i$15;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 162
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/i$16;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/tachikoma/i$16;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 163
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/a;

    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/tachikoma/a/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 164
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a;

    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/tachikoma/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V

    .line 165
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 166
    invoke-interface {v2}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKContainer()Landroid/widget/FrameLayout;

    move-result-object v2

    .line 167
    invoke-virtual {p0, v1, v0, p1, v2}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/components/r;Landroid/view/ViewGroup;)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/c/a;)V
    .locals 0

    .line 168
    invoke-interface {p0, p1}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/i;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZD:Z

    return p1
.end method

.method private aC(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/components/i;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    invoke-direct {v0, p1}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/e/d/c;->oA()V

    .line 3
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/i$24;

    invoke-direct {v1, p0, v0, p1}, Lcom/kwad/components/core/webview/tachikoma/i$24;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-object v1
.end method

.method private aS(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;->TK_FILE_LOAD_ERROR:Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;

    invoke-direct {p0, v0}, Lcom/kwad/components/core/webview/tachikoma/i;->b(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->aU(Ljava/lang/String;)V

    return-void
.end method

.method private static aT(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/StyleTemplate;
    .locals 0

    .line 1
    const-class p0, Lcom/kwad/sdk/components/DevelopMangerComponents;

    invoke-static {p0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    const/4 p0, 0x0

    return-object p0
.end method

.method private aU(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tl()Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->get()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;

    move-result-object v1

    new-instance v2, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    iget v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    invoke-direct {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;-><init>(I)V

    const/4 v3, 0x4

    .line 4
    invoke-virtual {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setRenderState(I)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v2

    .line 5
    invoke-virtual {v2, p1}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setErrorReason(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p1

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 6
    invoke-interface {v2}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setTemplateId(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p1

    iget v0, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setVersionCode(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "ad_client_error_log"

    .line 9
    invoke-virtual {v1, v0, p1}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->reportTKPerform(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method private aV(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "logTkRenderFail : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", templateId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 2
    invoke-interface {v1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TKLoadController"

    .line 3
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZF:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZG:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZG:Z

    .line 7
    invoke-static {}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->get()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    iget v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    invoke-direct {v1, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;-><init>(I)V

    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setRenderState(I)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v1

    .line 9
    invoke-virtual {v1, p1}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setErrorReason(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 10
    invoke-interface {v1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setTemplateId(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iget v1, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    .line 11
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setVersionCode(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "ad_client_error_log"

    .line 13
    invoke-virtual {v0, v1, p1}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->reportTKPerform(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/webview/tachikoma/i;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mActivity:Landroid/app/Activity;

    return-object p0
.end method

.method private b(Lcom/kwad/components/core/webview/jshandler/aj$a;)V
    .locals 4

    .line 15
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 16
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 17
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    iget v3, p1, Lcom/kwad/components/core/webview/jshandler/aj$a;->height:I

    int-to-float v3, v3

    invoke-static {v2, v3}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v2

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 18
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    iget v3, p1, Lcom/kwad/components/core/webview/jshandler/aj$a;->leftMargin:I

    int-to-float v3, v3

    invoke-static {v2, v3}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v2

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 19
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    iget v3, p1, Lcom/kwad/components/core/webview/jshandler/aj$a;->rightMargin:I

    int-to-float v3, v3

    invoke-static {v2, v3}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v2

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 20
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    iget p1, p1, Lcom/kwad/components/core/webview/jshandler/aj$a;->bottomMargin:I

    int-to-float p1, p1

    invoke-static {v2, p1}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    const/4 p1, -0x1

    .line 21
    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method private b(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 1

    .line 14
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$2;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i$2;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/webview/tachikoma/i;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->aV(Ljava/lang/String;)V

    return-void
.end method

.method private b(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V
    .locals 5

    .line 4
    iget-object v0, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    iget-object v1, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateUrl:Ljava/lang/String;

    const-string v2, ""

    const-string v3, "renderType_tk"

    invoke-static {v2, v3, v0, v1}, Lcom/kwad/sdk/utils/i;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u8bfb\u53d6\u5b8c\u6bd5\uff0c\u603b\u8017\u65f6"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Fe:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", \u8bfb\u53d6\u6210\u529f"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TKLoadController"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZD:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "\u6ca1\u6709\u8d85\u65f6"

    .line 7
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZY:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    .line 9
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$12;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i$12;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKContainer()Landroid/widget/FrameLayout;

    move-result-object p1

    .line 11
    instance-of v0, p1, Lcom/kwad/sdk/core/view/d;

    if-eqz v0, :cond_1

    .line 12
    check-cast p1, Lcom/kwad/sdk/core/view/d;

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZB:Lcom/kwad/sdk/core/view/d;

    .line 13
    invoke-interface {p1}, Lcom/kwad/sdk/core/view/d;->getWindowFocusChangeHelper()Lcom/kwad/sdk/core/view/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/kwad/sdk/core/view/c;->a(Lcom/kwad/sdk/core/view/b;)V

    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/webview/tachikoma/i;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZE:Z

    return p1
.end method

.method static synthetic c(Lcom/kwad/components/core/webview/tachikoma/i;)Lcom/kwad/sdk/core/response/model/AdResultData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    return-object p0
.end method

.method private c(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V
    .locals 3

    .line 3
    sget-object v0, Lcom/kwad/components/core/a;->md:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZC:Landroid/widget/TextView;

    if-nez v0, :cond_2

    .line 6
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZC:Landroid/widget/TextView;

    const/high16 v1, 0x41400000    # 12.0f

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZC:Landroid/widget/TextView;

    const/high16 v1, -0x10000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZC:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZC:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZC:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/core/webview/tachikoma/i;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZH:Z

    return p1
.end method

.method static synthetic d(Lcom/kwad/components/core/webview/tachikoma/i;)Lcom/kwad/sdk/components/r;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zy:Lcom/kwad/sdk/components/r;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/core/webview/tachikoma/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tr()V

    return-void
.end method

.method private f(Ljava/lang/Throwable;)V
    .locals 3

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "logTkRenderFail : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", templateId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 3
    invoke-interface {v1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TKLoadController"

    .line 4
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->get()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    iget v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    invoke-direct {v1, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;-><init>(I)V

    const/4 v2, 0x3

    .line 7
    invoke-virtual {v1, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setRenderState(I)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setErrorReason(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 9
    invoke-interface {v1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setTemplateId(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iget v1, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    .line 10
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setVersionCode(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "ad_client_error_log"

    .line 12
    invoke-virtual {v0, v1, p1}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->reportTKPerform(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic f(Lcom/kwad/components/core/webview/tachikoma/i;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZH:Z

    return p0
.end method

.method static synthetic g(Lcom/kwad/components/core/webview/tachikoma/i;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZR:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/core/webview/tachikoma/i;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZS:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/components/core/webview/tachikoma/i;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZE:Z

    return p0
.end method

.method private static isLocalDebugEnable()Z
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/components/DevelopMangerComponents;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    const/4 v0, 0x0

    return v0
.end method

.method static synthetic j(Lcom/kwad/components/core/webview/tachikoma/i;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZZ:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/components/core/webview/tachikoma/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tq()V

    return-void
.end method

.method static synthetic l(Lcom/kwad/components/core/webview/tachikoma/i;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZK:J

    return-wide v0
.end method

.method static synthetic m(Lcom/kwad/components/core/webview/tachikoma/i;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Fe:J

    return-wide v0
.end method

.method static synthetic n(Lcom/kwad/components/core/webview/tachikoma/i;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZL:J

    return-wide v0
.end method

.method static synthetic o(Lcom/kwad/components/core/webview/tachikoma/i;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZJ:J

    return-wide v0
.end method

.method static synthetic p(Lcom/kwad/components/core/webview/tachikoma/i;)Lcom/kwad/components/core/webview/tachikoma/c/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    return-object p0
.end method

.method static synthetic q(Lcom/kwad/components/core/webview/tachikoma/i;)Lcom/kwad/components/core/webview/tachikoma/b/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    return-object p0
.end method

.method static synthetic r(Lcom/kwad/components/core/webview/tachikoma/i;)Lcom/kwad/components/core/webview/tachikoma/a/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zz:Lcom/kwad/components/core/webview/tachikoma/a/p;

    return-object p0
.end method

.method static synthetic s(Lcom/kwad/components/core/webview/tachikoma/i;)Lcom/kwad/components/offline/api/tk/model/StyleTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    return-object p0
.end method

.method private ti()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZF:Z

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZG:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZD:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZE:Z

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZH:Z

    const-wide/16 v0, 0x0

    .line 6
    iput-wide v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Fe:J

    .line 7
    iput-wide v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZK:J

    .line 8
    iput-wide v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZL:J

    .line 9
    iput-wide v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZJ:J

    return-void
.end method

.method private tj()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/i;->isLocalDebugEnable()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x7d0

    .line 2
    iput v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZO:I

    const/16 v0, 0xbb8

    .line 3
    iput v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZP:I

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZY:Ljava/lang/Runnable;

    iget v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZO:I

    int-to-long v1, v1

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    .line 5
    iget v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZP:I

    if-lez v0, :cond_1

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZZ:Ljava/lang/Runnable;

    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    .line 7
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/core/threads/GlobalThreadPools;->Gr()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/i$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/tachikoma/i$1;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zx:Ljava/util/concurrent/Future;

    return-void
.end method

.method private static tk()Z
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/components/DevelopMangerComponents;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    const/4 v0, 0x0

    return v0
.end method

.method private tl()Lcom/kwad/components/offline/api/tk/model/StyleTemplate;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    if-eqz v1, :cond_0

    .line 3
    iget-object v0, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    .line 4
    :cond_0
    invoke-static {v0}, Lcom/kwad/components/core/webview/tachikoma/i;->aT(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    .line 5
    :cond_1
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/i;->isLocalDebugEnable()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 6
    new-instance v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    invoke-direct {v1}, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;-><init>()V

    .line 7
    iput-object v0, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    const-string v2, "1.0.4"

    .line 8
    iput-object v2, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersion:Ljava/lang/String;

    const/16 v2, 0x68

    .line 9
    iput v2, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    .line 10
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/i;->tk()Z

    move-result v2

    const-string v3, ":9292/"

    const-string v4, "http://"

    if-eqz v2, :cond_2

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/kwad/components/offline/api/OfflineHostProvider;->getApi()Lcom/kwad/components/offline/api/core/IOfflineHostApi;

    move-result-object v4

    invoke-interface {v4}, Lcom/kwad/components/offline/api/core/IOfflineHostApi;->env()Lcom/kwad/components/offline/api/core/api/IEnvironment;

    move-result-object v4

    invoke-interface {v4}, Lcom/kwad/components/offline/api/core/api/IEnvironment;->localIpAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".104.coverage.zip"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateUrl:Ljava/lang/String;

    goto :goto_0

    .line 12
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/kwad/components/offline/api/OfflineHostProvider;->getApi()Lcom/kwad/components/offline/api/core/IOfflineHostApi;

    move-result-object v4

    invoke-interface {v4}, Lcom/kwad/components/offline/api/core/IOfflineHostApi;->env()Lcom/kwad/components/offline/api/core/api/IEnvironment;

    move-result-object v4

    invoke-interface {v4}, Lcom/kwad/components/offline/api/core/api/IEnvironment;->localIpAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".104.zip"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateUrl:Ljava/lang/String;

    :goto_0
    return-object v1

    .line 13
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    if-eqz v0, :cond_4

    return-object v0

    .line 14
    :cond_4
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    return-object v1

    .line 15
    :cond_5
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 16
    invoke-interface {v2}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/kwad/sdk/core/response/b/b;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;

    move-result-object v0

    if-nez v0, :cond_6

    return-object v1

    .line 17
    :cond_6
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    if-nez v2, :cond_7

    .line 18
    new-instance v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    invoke-direct {v1}, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;-><init>()V

    .line 19
    iget-object v2, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$BaseMatrixTemplate;->templateId:Ljava/lang/String;

    iput-object v2, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    .line 20
    iget-object v2, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;->templateMd5:Ljava/lang/String;

    iput-object v2, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateMd5:Ljava/lang/String;

    .line 21
    iget-object v2, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;->templateUrl:Ljava/lang/String;

    iput-object v2, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateUrl:Ljava/lang/String;

    .line 22
    iget-wide v2, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;->templateVersionCode:J

    long-to-int v0, v2

    iput v0, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    const/4 v0, 0x0

    .line 23
    iput v0, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->tkSouce:I

    goto :goto_1

    .line 24
    :cond_7
    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    iget-object v4, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$BaseMatrixTemplate;->templateId:Ljava/lang/String;

    iget-object v5, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;->templateMd5:Ljava/lang/String;

    iget-object v6, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;->templateUrl:Ljava/lang/String;

    iget-wide v0, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;->templateVersionCode:J

    long-to-int v7, v0

    .line 25
    invoke-interface/range {v2 .. v7}, Lcom/kwad/components/core/n/a/d/c;->checkStyleTemplateById(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    move-result-object v1

    :goto_1
    return-object v1
.end method

.method private tm()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    .line 2
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 3
    invoke-interface {v2}, Lcom/kwad/components/core/webview/tachikoma/j;->getTouchCoordsView()Lcom/kwad/sdk/widget/e;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 4
    invoke-interface {v3}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKContainer()Landroid/widget/FrameLayout;

    move-result-object v3

    iget-object v4, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 5
    invoke-interface {v4}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kwad/sdk/core/webview/e;->a(ILcom/kwad/sdk/widget/e;Landroid/view/ViewGroup;Ljava/lang/String;)V

    return-void
.end method

.method private to()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tl()Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->tkSouce:I

    iput v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    .line 3
    invoke-static {}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->get()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;

    move-result-object v1

    new-instance v2, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    iget v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    invoke-direct {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;-><init>(I)V

    const/4 v3, -0x1

    .line 4
    invoke-virtual {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setRenderState(I)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 5
    invoke-interface {v3}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setTemplateId(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v2

    iget v0, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    .line 6
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setVersionCode(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "ad_client_apm_log"

    .line 8
    invoke-virtual {v1, v2, v0}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->reportTKPerform(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method private tp()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZF:Z

    .line 2
    invoke-static {}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->get()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    iget v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    invoke-direct {v1, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;-><init>(I)V

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v1, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setRenderState(I)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 4
    invoke-interface {v2}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setTemplateId(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iget v2, v2, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    .line 5
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setVersionCode(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;->toJson()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "ad_client_apm_log"

    .line 7
    invoke-virtual {v0, v2, v1}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->reportTKPerform(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method private tq()V
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "logTkRenderSuccess, templateId = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 2
    invoke-interface {v1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TKLoadController"

    .line 3
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZF:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZG:Z

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZG:Z

    .line 6
    iget-wide v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZJ:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZJ:J

    sub-long v4, v2, v4

    .line 7
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "render time, templateId = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v3}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " init:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZL:J

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " load:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZK:J

    iget-wide v8, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Fe:J

    sub-long/2addr v6, v8

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " render:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->get()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;

    move-result-object v1

    new-instance v2, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    iget v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    invoke-direct {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;-><init>(I)V

    .line 9
    invoke-virtual {v2, v0}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setRenderState(I)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v0

    .line 10
    invoke-virtual {v0, v4, v5}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setRenderTime(J)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 11
    invoke-interface {v2}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setTemplateId(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v0

    iget-wide v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZK:J

    iget-wide v4, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Fe:J

    sub-long/2addr v2, v4

    .line 12
    invoke-virtual {v0, v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setLoadTime(J)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v0

    iget-wide v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZL:J

    .line 13
    invoke-virtual {v0, v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setInitTime(J)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iget v2, v2, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    .line 14
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setVersionCode(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "ad_client_apm_log"

    .line 16
    invoke-virtual {v1, v2, v0}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->reportTKPerform(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private tr()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "logTkRenderFail : timeout, templateId = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 2
    invoke-interface {v1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TKLoadController"

    .line 3
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tl()Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-static {}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->get()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;

    move-result-object v1

    new-instance v2, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    iget v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    invoke-direct {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;-><init>(I)V

    const/4 v3, 0x3

    .line 6
    invoke-virtual {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setRenderState(I)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v2

    const-string v3, "timeout"

    .line 7
    invoke-virtual {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setErrorReason(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 8
    invoke-interface {v3}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setTemplateId(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v2

    iget v0, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateVersionCode:I

    .line 9
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setVersionCode(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "ad_client_error_log"

    .line 11
    invoke-virtual {v1, v2, v0}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->reportTKPerform(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method private ts()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZM:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZM:Ljava/util/Map;

    const-string v1, "TKVersion"

    const-string v2, "6.0.7"

    .line 3
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZM:Ljava/util/Map;

    const-string v1, "SDKVersion"

    const-string v2, "3.3.63"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZM:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "sdkType"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZM:Ljava/util/Map;

    return-object v0
.end method

.method private tt()V
    .locals 10

    const-string v0, "TKLoadController"

    .line 1
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zy:Lcom/kwad/sdk/components/r;

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mContext:Landroid/content/Context;

    iget-object v4, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 3
    invoke-interface {v4}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/kwad/components/core/n/a/d/c;->getJsBaseDir(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance v2, Ljava/io/File;

    const-string v3, "kcov.json"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 6
    :cond_1
    :try_start_0
    invoke-static {v2}, Lcom/kwad/sdk/utils/q;->V(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    .line 8
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "kcov.json:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "gitHeadCommit"

    .line 10
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v1, "coverageApi"

    .line 11
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "coverageTaskId"

    .line 12
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "currentBranch"

    .line 13
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 14
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 15
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 16
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 17
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 18
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u5c1d\u8bd5\u83b7\u53d6\u8986\u76d6\u7387\u7edf\u8ba1... "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iget-object v1, v1, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    goto :goto_0

    :cond_4
    const-string v1, ""

    :goto_0
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zy:Lcom/kwad/sdk/components/r;

    const-string v1, "JSON.stringify(this.__coverage__)"

    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/r;->execute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 20
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_5

    return-void

    .line 21
    :cond_5
    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 22
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i$19;

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v9}, Lcom/kwad/components/core/webview/tachikoma/i$19;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_6
    :goto_1
    const-string v1, "kcov.json\u6570\u636e\u4e0d\u5408\u6cd5\uff0c\u7f3a\u5c11\u5173\u952e\u5b57\u6bb5gitHeadCommit | coverageApi | coverageTaskId | currentBranch"

    .line 23
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 24
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    return-void
.end method

.method static synthetic tu()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/webview/tachikoma/i;->ZN:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/core/webview/tachikoma/j;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 15
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mActivity:Landroid/app/Activity;

    .line 16
    iput-object p2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    .line 17
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/core/webview/b;->d(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 18
    iput-object p3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 19
    invoke-interface {p3}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZR:Ljava/lang/String;

    .line 20
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKReaderScene()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZS:Ljava/lang/String;

    .line 21
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ti()V

    .line 22
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKContainer()Landroid/widget/FrameLayout;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 23
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 24
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CE()Z

    move-result p1

    if-nez p1, :cond_1

    .line 25
    sget-object p1, Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;->SWITCH_CLOSE:Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;

    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->b(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V

    return-void

    .line 26
    :cond_1
    const-class p1, Lcom/kwad/components/core/n/a/d/c;

    invoke-static {p1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/n/a/d/c;

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    .line 27
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->to()V

    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "bind mTKPlugin: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TKLoadController"

    invoke-static {p2, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZR:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 30
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tn()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZS:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/kwad/sdk/commercial/e/a;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V

    .line 31
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    if-eqz p1, :cond_3

    .line 32
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tj()V

    return-void

    .line 33
    :cond_3
    sget-object p1, Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;->PLUGIN_NOT_READY:Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;

    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->b(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V

    .line 34
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZR:Ljava/lang/String;

    const-string p2, "offline_failed"

    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/webview/tachikoma/i;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-static {}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->get()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;

    move-result-object p1

    new-instance p3, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    iget v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZI:I

    invoke-direct {p3, v0}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;-><init>(I)V

    const/4 v0, 0x4

    .line 36
    invoke-virtual {p3, v0}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setRenderState(I)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p3

    .line 37
    invoke-virtual {p3, p2}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setErrorReason(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p2

    iget-object p3, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZR:Ljava/lang/String;

    .line 38
    invoke-virtual {p2, p3}, Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;->setTemplateId(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/model/report/TKPerformMsg;

    move-result-object p2

    .line 39
    invoke-virtual {p2}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;->toJson()Lorg/json/JSONObject;

    move-result-object p2

    const-string p3, "ad_client_error_log"

    .line 40
    invoke-virtual {p1, p3, p2}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;->reportTKPerform(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final a(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    return-void
.end method

.method protected a(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/components/r;Landroid/view/ViewGroup;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/c/g;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zv:Lcom/kwad/sdk/core/webview/c/g;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/webview/d/b/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 170
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    if-eqz v0, :cond_0

    .line 171
    invoke-interface {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/j;->a(Lcom/kwad/sdk/core/webview/d/b/a;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 169
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->ts()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected c(Lcom/kwad/sdk/core/webview/b;)Lcom/kwad/components/core/webview/jshandler/ak;
    .locals 1

    .line 12
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ak;

    invoke-direct {v0, p1}, Lcom/kwad/components/core/webview/jshandler/ak;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    return-object v0
.end method

.method public final callJS(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zy:Lcom/kwad/sdk/components/r;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-interface {v0, p1, v1, v1}, Lcom/kwad/sdk/components/r;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/components/q;)V

    :cond_0
    return-void
.end method

.method public dismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sZ()V

    :cond_0
    return-void
.end method

.method protected f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final getTkTemplateId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i(Landroid/view/View;Z)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->getTKContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZA:Lcom/kwad/components/core/webview/jshandler/av;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/jshandler/av;->aU(Z)V

    :cond_0
    return-void
.end method

.method public jq()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZB:Lcom/kwad/sdk/core/view/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/core/view/d;->getWindowFocusChangeHelper()Lcom/kwad/sdk/core/view/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/core/view/c;->b(Lcom/kwad/sdk/core/view/b;)V

    .line 3
    iput-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZB:Lcom/kwad/sdk/core/view/d;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zx:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    .line 5
    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZY:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZZ:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    .line 8
    invoke-static {}, Lcom/kwad/components/core/e/e/g;->oQ()Lcom/kwad/components/core/e/e/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/e/g;->b(Lcom/kwad/components/core/e/e/f;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Wm:Lcom/kwad/sdk/core/download/d;

    if-eqz v0, :cond_2

    .line 10
    invoke-static {}, Lcom/kwad/sdk/core/download/b;->DO()Lcom/kwad/sdk/core/download/b;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Wm:Lcom/kwad/sdk/core/download/d;

    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/download/b;->a(Lcom/kwad/sdk/core/download/c;)V

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    if-eqz v0, :cond_3

    .line 12
    invoke-virtual {v0}, Lcom/kwad/components/core/proxy/g;->dismiss()V

    .line 13
    :cond_3
    sget-object v0, Lcom/kwad/components/core/a;->md:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/i;->tt()V

    .line 15
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zw:Lcom/kwad/components/core/n/a/d/c;

    if-eqz v0, :cond_5

    .line 16
    invoke-interface {v0}, Lcom/kwad/components/core/n/a/d/c;->onDestroy()V

    .line 17
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zy:Lcom/kwad/sdk/components/r;

    if-eqz v0, :cond_6

    .line 18
    iput-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/i;->Zy:Lcom/kwad/sdk/components/r;

    .line 19
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/i$18;

    invoke-direct {v1, p0, v0}, Lcom/kwad/components/core/webview/tachikoma/i$18;-><init>(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/sdk/components/r;)V

    invoke-static {v1}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    :cond_6
    return-void
.end method

.method protected nJ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->ta()V

    :cond_0
    return-void
.end method

.method public final th()Lcom/kwad/sdk/core/webview/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    return-object v0
.end method

.method protected final tn()Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i;->ZU:Lcom/kwad/sdk/core/webview/e;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/b;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    return-object v0
.end method
