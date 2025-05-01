.class public Lcom/beizi/ad/internal/network/a;
.super Landroid/os/AsyncTask;
.source "AdRequestImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/network/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Lcom/beizi/ad/internal/network/ServerResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String;

.field private static final c:Lcom/beizi/ad/internal/network/ServerResponse;


# instance fields
.field private a:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/beizi/ad/internal/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/os/Bundle;

.field private final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/Date;

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Z

.field private k:Ljava/lang/String;

.field private l:I

.field private m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/beizi/ad/internal/network/ServerResponse;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/beizi/ad/internal/network/ServerResponse;-><init>(Z)V

    sput-object v0, Lcom/beizi/ad/internal/network/a;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    const-string v0, "emulator"

    .line 2
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HashingFunctions;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/beizi/ad/internal/network/a;->b:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->d:Ljava/util/Set;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->e:Landroid/os/Bundle;

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->f:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/beizi/ad/internal/network/a$a;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 6
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->a(Lcom/beizi/ad/internal/network/a$a;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->g:Ljava/util/Date;

    .line 7
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->b(Lcom/beizi/ad/internal/network/a$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->h:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->c(Lcom/beizi/ad/internal/network/a$a;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/a;->i:I

    .line 9
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->d(Lcom/beizi/ad/internal/network/a$a;)Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->d:Ljava/util/Set;

    .line 10
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->e(Lcom/beizi/ad/internal/network/a$a;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->e:Landroid/os/Bundle;

    .line 11
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->f(Lcom/beizi/ad/internal/network/a$a;)Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->f:Ljava/util/Set;

    .line 12
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->g(Lcom/beizi/ad/internal/network/a$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/a;->j:Z

    .line 13
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->h(Lcom/beizi/ad/internal/network/a$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->k:Ljava/lang/String;

    .line 14
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->i(Lcom/beizi/ad/internal/network/a$a;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/a;->l:I

    .line 15
    invoke-static {p1}, Lcom/beizi/ad/internal/network/a$a;->j(Lcom/beizi/ad/internal/network/a$a;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/beizi/ad/internal/network/a;->m:Z

    return-void
.end method

.method private a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 108
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    const/16 v0, 0x1388

    .line 109
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 110
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v0, 0x1

    .line 111
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 112
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const/4 v0, 0x0

    .line 113
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const-string v0, "POST"

    .line 114
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    return-object p1
.end method

.method private a(I)V
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/e;

    if-eqz v0, :cond_0

    .line 13
    invoke-interface {v0, p1}, Lcom/beizi/ad/internal/e;->a(I)V

    .line 14
    :cond_0
    invoke-static {}, Lcom/beizi/ad/internal/utilities/HaoboLog;->clearLastResponse()V

    return-void
.end method

.method private a(Ljava/net/HttpURLConnection;[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 115
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    iget-object v0, v0, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    const-string v1, "User-Agent"

    invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Content-Type"

    const-string v1, "application/json"

    .line 116
    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Accept"

    .line 117
    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-static {}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->getCookie()Ljava/lang/String;

    move-result-object v0

    .line 119
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Cookie"

    .line 120
    invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    :cond_0
    array-length v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Connect-Length"

    invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    array-length v0, p2

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 123
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    .line 124
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 125
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 126
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method private b(I)Z
    .locals 4

    const/16 v0, 0xc8

    if-eq p1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->http_bad_status:I

    int-to-long v2, p1

    invoke-static {v1, v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IJ)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lcom/beizi/ad/internal/network/ServerResponse;
    .locals 8

    const-string p1, "lance"

    .line 15
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/e;

    if-eqz v0, :cond_7

    .line 16
    invoke-interface {v0}, Lcom/beizi/ad/internal/e;->c()Lcom/beizi/ad/internal/d;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 17
    :try_start_0
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->i()Lcom/beizi/ad/internal/j;

    move-result-object v1

    sget-object v2, Lcom/beizi/ad/internal/j;->f:Lcom/beizi/ad/internal/j;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v2

    .line 19
    invoke-static {}, Lcom/beizi/ad/internal/utilities/DeviceInfo;->getInstance()Lcom/beizi/ad/internal/utilities/DeviceInfo;

    move-result-object v3

    .line 20
    new-instance v4, Lcom/beizi/ad/c/d$a$a;

    invoke-direct {v4}, Lcom/beizi/ad/c/d$a$a;-><init>()V

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->sdkUID:Ljava/lang/String;

    .line 21
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->a(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    sget-object v5, Lcom/beizi/ad/internal/utilities/DeviceInfo;->density:Ljava/lang/String;

    .line 22
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->j(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    .line 23
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v5

    iget-object v5, v5, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {v5}, Lcom/beizi/ad/lance/a/m;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->l(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    .line 24
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v5

    iget-object v5, v5, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {v5}, Lcom/beizi/ad/lance/a/m;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->m(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->bootMark:Ljava/lang/String;

    .line 25
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->n(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->updateMark:Ljava/lang/String;

    .line 26
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->o(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    const-string v5, ""

    .line 27
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->b(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->os:Ljava/lang/String;

    .line 28
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->c(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    sget-object v5, Lcom/beizi/ad/c/e$e;->c:Lcom/beizi/ad/c/e$e;

    .line 29
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->a(Lcom/beizi/ad/c/e$e;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->devType:Lcom/beizi/ad/c/e$b;

    .line 30
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->a(Lcom/beizi/ad/c/e$b;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->brand:Ljava/lang/String;

    .line 31
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->d(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->model:Ljava/lang/String;

    .line 32
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->e(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->manufacturer:Ljava/lang/String;

    .line 33
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->f(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->resolution:Ljava/lang/String;

    .line 34
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->g(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->screenSize:Ljava/lang/String;

    .line 35
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->h(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->language:Ljava/lang/String;

    .line 36
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->i(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->root:Ljava/lang/String;

    .line 37
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->k(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->agVercode:Ljava/lang/String;

    .line 38
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->p(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-boolean v5, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->wxInstalled:Z

    .line 39
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->a(Z)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    sget-object v5, Lcom/beizi/ad/internal/utilities/DeviceInfo;->physicalMemoryByte:Ljava/lang/String;

    .line 40
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->q(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    sget-object v5, Lcom/beizi/ad/internal/utilities/DeviceInfo;->harddiskSizeByte:Ljava/lang/String;

    .line 41
    invoke-virtual {v4, v5}, Lcom/beizi/ad/c/d$a$a;->r(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v4

    iget-object v3, v3, Lcom/beizi/ad/internal/utilities/DeviceInfo;->hmsCoreVersion:Ljava/lang/String;

    .line 42
    invoke-virtual {v4, v3}, Lcom/beizi/ad/c/d$a$a;->s(Ljava/lang/String;)Lcom/beizi/ad/c/d$a$a;

    move-result-object v3

    .line 43
    invoke-virtual {v3}, Lcom/beizi/ad/c/d$a$a;->a()Lcom/beizi/ad/c/d$a;

    move-result-object v3

    .line 44
    invoke-static {}, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->getInstance()Lcom/beizi/ad/internal/utilities/UserEnvInfo;

    move-result-object v4

    .line 45
    new-instance v5, Lcom/beizi/ad/c/d$c$a;

    invoke-direct {v5}, Lcom/beizi/ad/c/d$c$a;-><init>()V

    iget-object v6, v4, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->net:Lcom/beizi/ad/c/e$d;

    .line 46
    invoke-virtual {v5, v6}, Lcom/beizi/ad/c/d$c$a;->a(Lcom/beizi/ad/c/e$d;)Lcom/beizi/ad/c/d$c$a;

    move-result-object v5

    iget-object v4, v4, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->isp:Lcom/beizi/ad/c/e$c;

    .line 47
    invoke-virtual {v5, v4}, Lcom/beizi/ad/c/d$c$a;->a(Lcom/beizi/ad/c/e$c;)Lcom/beizi/ad/c/d$c$a;

    move-result-object v4

    .line 48
    invoke-virtual {v4}, Lcom/beizi/ad/c/d$c$a;->a()Lcom/beizi/ad/c/d$c;

    move-result-object v4

    .line 49
    new-instance v5, Lcom/beizi/ad/c/a$b$a;

    invoke-direct {v5}, Lcom/beizi/ad/c/a$b$a;-><init>()V

    const-string v6, "3.5.0.4"

    .line 50
    invoke-virtual {v5, v6}, Lcom/beizi/ad/c/a$b$a;->a(Ljava/lang/String;)Lcom/beizi/ad/c/a$b$a;

    move-result-object v5

    sget-object v6, Lcom/beizi/ad/c/e$i;->b:Lcom/beizi/ad/c/e$i;

    .line 51
    invoke-virtual {v5, v6}, Lcom/beizi/ad/c/a$b$a;->a(Lcom/beizi/ad/c/e$i;)Lcom/beizi/ad/c/a$b$a;

    move-result-object v5

    .line 52
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v6

    iget-object v6, v6, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {v6}, Lcom/beizi/ad/internal/utilities/UserEnvInfoUtil;->getVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/beizi/ad/c/a$b$a;->c(Ljava/lang/String;)Lcom/beizi/ad/c/a$b$a;

    move-result-object v5

    if-eqz v1, :cond_1

    .line 53
    sget-object v6, Lcom/beizi/ad/c/e$g;->c:Lcom/beizi/ad/c/e$g;

    goto :goto_1

    :cond_1
    sget-object v6, Lcom/beizi/ad/c/e$g;->b:Lcom/beizi/ad/c/e$g;

    :goto_1
    invoke-virtual {v5, v6}, Lcom/beizi/ad/c/a$b$a;->a(Lcom/beizi/ad/c/e$g;)Lcom/beizi/ad/c/a$b$a;

    move-result-object v5

    .line 54
    invoke-static {}, Lcom/beizi/ad/lance/a/p;->c()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/beizi/ad/c/a$b$a;->a(J)Lcom/beizi/ad/c/a$b$a;

    move-result-object v5

    .line 55
    invoke-virtual {v2}, Lcom/beizi/ad/internal/g;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/beizi/ad/c/a$b$a;->b(Ljava/lang/String;)Lcom/beizi/ad/c/a$b$a;

    move-result-object v2

    .line 56
    invoke-virtual {v2, v3}, Lcom/beizi/ad/c/a$b$a;->a(Lcom/beizi/ad/c/d$a;)Lcom/beizi/ad/c/a$b$a;

    move-result-object v2

    .line 57
    invoke-virtual {v2, v4}, Lcom/beizi/ad/c/a$b$a;->a(Lcom/beizi/ad/c/d$c;)Lcom/beizi/ad/c/a$b$a;

    move-result-object v2

    .line 58
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/beizi/ad/lance/a/p;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/ad/c/a$b$a;->c(Ljava/lang/String;)Lcom/beizi/ad/c/a$b$a;

    move-result-object v2

    .line 59
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/beizi/ad/lance/a/p;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/ad/c/a$b$a;->d(Ljava/lang/String;)Lcom/beizi/ad/c/a$b$a;

    move-result-object v2

    .line 60
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/beizi/ad/lance/a/p;->a(Landroid/content/Context;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/beizi/ad/c/a$b$a;->b(J)Lcom/beizi/ad/c/a$b$a;

    move-result-object v2

    .line 61
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/beizi/ad/lance/a/p;->b(Landroid/content/Context;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/beizi/ad/c/a$b$a;->c(J)Lcom/beizi/ad/c/a$b$a;

    move-result-object v2

    if-eqz v1, :cond_3

    .line 62
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/internal/g;->l()Ljava/util/HashSet;

    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 64
    invoke-static {v3}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 65
    new-instance v4, Lcom/beizi/ad/c/a$a$a;

    invoke-direct {v4}, Lcom/beizi/ad/c/a$a$a;-><init>()V

    .line 66
    invoke-virtual {v4, v3}, Lcom/beizi/ad/c/a$a$a;->a(Ljava/lang/String;)Lcom/beizi/ad/c/a$a$a;

    move-result-object v3

    .line 67
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/beizi/ad/c/a$a$a;->c(Ljava/lang/String;)Lcom/beizi/ad/c/a$a$a;

    move-result-object v3

    .line 68
    invoke-virtual {v3}, Lcom/beizi/ad/c/a$a$a;->a()Lcom/beizi/ad/c/a$a;

    move-result-object v3

    .line 69
    invoke-virtual {v2, v3}, Lcom/beizi/ad/c/a$b$a;->a(Lcom/beizi/ad/c/a$a;)V

    goto :goto_2

    .line 70
    :cond_3
    new-instance v1, Lcom/beizi/ad/c/a$a$a;

    invoke-direct {v1}, Lcom/beizi/ad/c/a$a$a;-><init>()V

    .line 71
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/beizi/ad/c/a$a$a;->a(Ljava/lang/String;)Lcom/beizi/ad/c/a$a$a;

    move-result-object v1

    .line 72
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/beizi/ad/c/a$a$a;->c(Ljava/lang/String;)Lcom/beizi/ad/c/a$a$a;

    move-result-object v1

    .line 73
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/beizi/ad/c/a$a$a;->b(Ljava/lang/String;)Lcom/beizi/ad/c/a$a$a;

    move-result-object v1

    .line 74
    invoke-virtual {v1}, Lcom/beizi/ad/c/a$a$a;->a()Lcom/beizi/ad/c/a$a;

    move-result-object v1

    .line 75
    invoke-virtual {v2, v1}, Lcom/beizi/ad/c/a$b$a;->a(Lcom/beizi/ad/c/a$a;)V

    .line 76
    :cond_4
    invoke-virtual {v2}, Lcom/beizi/ad/c/a$b$a;->a()Lcom/beizi/ad/c/a$b;

    move-result-object v1

    .line 77
    invoke-static {}, Lcom/beizi/ad/lance/a/k;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/beizi/ad/c/a$b;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/lance/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sdkRequest:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/beizi/ad/c/a$b;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/beizi/ad/lance/a/l;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/ad/internal/g;->m()Ljava/lang/String;

    move-result-object v3

    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getRequestBaseUrl:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/beizi/ad/lance/a/l;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    invoke-virtual {v1}, Lcom/beizi/ad/c/a$b;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->setLastRequest(Ljava/lang/String;)V

    .line 82
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->fetch_url:I

    invoke-static {}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getLastRequest()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    new-instance p1, Ljava/net/URL;

    invoke-direct {p1, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/a;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object p1

    .line 84
    invoke-direct {p0, p1, v2}, Lcom/beizi/ad/internal/network/a;->a(Ljava/net/HttpURLConnection;[B)V

    .line 85
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V

    .line 86
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/beizi/ad/internal/network/a;->b(I)Z

    move-result v1

    if-nez v1, :cond_5

    .line 87
    sget-object p1, Lcom/beizi/ad/internal/network/a;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    return-object p1

    .line 88
    :cond_5
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v1

    if-nez v1, :cond_6

    .line 89
    sget-object v1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v2, Lcom/beizi/ad/R$string;->response_blank:I

    invoke-static {v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_6
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    .line 91
    invoke-static {v1}, Lcom/beizi/ad/c/b$i;->a(Ljava/io/InputStream;)Lcom/beizi/ad/c/b$i;

    move-result-object v2

    .line 92
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 93
    new-instance v1, Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->i()Lcom/beizi/ad/internal/j;

    move-result-object v0

    invoke-direct {v1, v2, p1, v0}, Lcom/beizi/ad/internal/network/ServerResponse;-><init>(Lcom/beizi/ad/c/b$i;Ljava/util/Map;Lcom/beizi/ad/internal/j;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    .line 94
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 95
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->unknown_exception:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    sget-object p1, Lcom/beizi/ad/internal/network/a;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    return-object p1

    .line 98
    :catch_1
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->http_unknown:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    sget-object p1, Lcom/beizi/ad/internal/network/a;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    return-object p1

    .line 100
    :catch_2
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->permissions_internet:I

    .line 101
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 102
    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    sget-object p1, Lcom/beizi/ad/internal/network/a;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    return-object p1

    .line 104
    :catch_3
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->http_io:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    sget-object p1, Lcom/beizi/ad/internal/network/a;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    return-object p1

    .line 106
    :catch_4
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->http_url_malformed:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    sget-object p1, Lcom/beizi/ad/internal/network/a;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    return-object p1

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Lcom/beizi/ad/internal/e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/network/a;->a:Ljava/lang/ref/SoftReference;

    .line 2
    invoke-interface {p1}, Lcom/beizi/ad/internal/e;->c()Lcom/beizi/ad/internal/d;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/DeviceInfoUtil;->retrieveDeviceInfo(Landroid/content/Context;)V

    .line 5
    invoke-virtual {p1}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/UserEnvInfoUtil;->retrieveUserEnvInfo(Landroid/content/Context;)V

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/beizi/ad/internal/network/c;->a(Landroid/content/Context;)Lcom/beizi/ad/internal/network/c;

    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/beizi/ad/internal/network/c;->b(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/a;->a(I)V

    .line 9
    invoke-virtual {p0, v0}, Landroid/os/AsyncTask;->cancel(Z)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/a;->a(I)V

    .line 11
    invoke-virtual {p0, v0}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_1
    :goto_0
    return-void
.end method

.method protected a(Lcom/beizi/ad/internal/network/ServerResponse;)V
    .locals 2

    const/4 v0, 0x2

    if-nez p1, :cond_0

    .line 127
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->no_response:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/network/a;->a(I)V

    return-void

    .line 129
    :cond_0
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 130
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/network/a;->a(I)V

    return-void

    .line 131
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/a;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/e;

    if-eqz v0, :cond_2

    .line 132
    invoke-interface {v0, p1}, Lcom/beizi/ad/internal/e;->a(Lcom/beizi/ad/internal/network/ServerResponse;)V

    :cond_2
    return-void
.end method

.method protected b(Lcom/beizi/ad/internal/network/ServerResponse;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 2
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onCancelled(Ljava/lang/Object;)V

    .line 3
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->cancel_request:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/network/a;->a([Ljava/lang/Void;)Lcom/beizi/ad/internal/network/ServerResponse;

    move-result-object p1

    return-object p1
.end method

.method protected synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 1
    check-cast p1, Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/network/a;->b(Lcom/beizi/ad/internal/network/ServerResponse;)V

    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/network/a;->a(Lcom/beizi/ad/internal/network/ServerResponse;)V

    return-void
.end method
