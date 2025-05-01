.class public Lcom/beizi/ad/internal/network/ServerResponse;
.super Ljava/lang/Object;
.source "ServerResponse.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;
    }
.end annotation


# static fields
.field public static final EXTRAS_KEY_MRAID:Ljava/lang/String; = "MRAID"

.field public static final EXTRAS_KEY_ORIENTATION:Ljava/lang/String; = "ORIENTATION"

.field public static final EXTRAS_KEY_REWARD_ITEM:Ljava/lang/String; = "REWARD_ITEM"

.field public static final EXTRAS_KEY_SCALE:Ljava/lang/String; = "SCALE"


# instance fields
.field private A:I

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:Ljava/lang/String;

.field private J:Ljava/lang/String;

.field private K:Ljava/lang/String;

.field private L:Ljava/lang/String;

.field private M:Lcom/beizi/ad/c/b$b$a;

.field private N:Z

.field private O:Lcom/beizi/ad/c/b$b;

.field private P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/ad/c/b$h;",
            ">;"
        }
    .end annotation
.end field

.field private Q:Ljava/lang/String;

.field private R:Ljava/lang/String;

.field private S:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/beizi/ad/internal/i;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private T:Ljava/lang/String;

.field private U:Ljava/lang/String;

.field private V:Ljava/lang/String;

.field private W:Ljava/lang/String;

.field private X:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private Y:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/beizi/ad/internal/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private Z:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private a:Ljava/lang/String;

.field private aa:Z

.field private ab:Z

.field private ac:Ljava/lang/String;

.field private ad:Ljava/lang/String;

.field private ae:Ljava/lang/String;

.field private af:Ljava/lang/String;

.field private ag:Ljava/lang/String;

.field private ah:Lcom/beizi/ad/internal/nativead/a;

.field private b:Ljava/lang/String;

.field private c:Lcom/beizi/ad/c/e$a;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field public mDetectClickUrl:Ljava/lang/String;

.field public mDetectViewUrl:Ljava/lang/String;

.field public mMediaType:Lcom/beizi/ad/internal/j;

.field private n:Z

.field private o:Z

.field private p:I

.field private q:I

.field private r:Z

.field private s:I

.field private t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

.field private u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

.field private v:Z

.field private w:Ljava/lang/String;

.field private x:Z

.field private y:Lcom/beizi/ad/c/b$b$c;

.field private z:Lcom/beizi/ad/c/b$b$b;


# direct methods
.method public constructor <init>(Lcom/beizi/ad/c/b$i;Ljava/util/Map;Lcom/beizi/ad/internal/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/beizi/ad/c/b$i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lcom/beizi/ad/internal/j;",
            ")V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->d:I

    const/4 v1, 0x1

    .line 34
    iput v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->e:I

    .line 35
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->f:I

    .line 36
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->g:I

    .line 37
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    .line 38
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    .line 39
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->j:Z

    .line 40
    iput-boolean v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    .line 41
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->l:Z

    .line 42
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->m:Z

    .line 43
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->n:Z

    .line 44
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->o:Z

    .line 45
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->p:I

    .line 46
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->q:I

    .line 47
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->r:Z

    .line 48
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->s:I

    .line 49
    new-instance v1, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-direct {v1}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    .line 50
    new-instance v1, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-direct {v1}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    .line 51
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->v:Z

    .line 52
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->x:Z

    .line 53
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->S:Ljava/util/List;

    .line 54
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    .line 55
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Y:Ljava/util/LinkedList;

    .line 56
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Z:Ljava/util/HashMap;

    .line 57
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->aa:Z

    .line 58
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ab:Z

    if-nez p1, :cond_0

    .line 59
    invoke-static {}, Lcom/beizi/ad/internal/utilities/HaoboLog;->clearLastResponse()V

    return-void

    .line 60
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->setLastResponse(Ljava/lang/String;)V

    .line 61
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->response_body:I

    .line 62
    invoke-static {}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getLastResponse()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 63
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    iput-object p3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mMediaType:Lcom/beizi/ad/internal/j;

    .line 65
    invoke-direct {p0, p2}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Ljava/util/Map;)V

    .line 66
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Lcom/beizi/ad/c/b$i;)V

    .line 67
    invoke-direct {p0}, Lcom/beizi/ad/internal/network/ServerResponse;->b()V

    return-void
.end method

.method public constructor <init>(Lcom/beizi/ad/internal/utilities/HTTPResponse;Lcom/beizi/ad/internal/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->d:I

    const/4 v1, 0x1

    .line 3
    iput v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->e:I

    .line 4
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->f:I

    .line 5
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->g:I

    .line 6
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    .line 7
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    .line 8
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->j:Z

    .line 9
    iput-boolean v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    .line 10
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->l:Z

    .line 11
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->m:Z

    .line 12
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->n:Z

    .line 13
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->o:Z

    .line 14
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->p:I

    .line 15
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->q:I

    .line 16
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->r:Z

    .line 17
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->s:I

    .line 18
    new-instance v1, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-direct {v1}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    .line 19
    new-instance v1, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-direct {v1}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    .line 20
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->v:Z

    .line 21
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->x:Z

    .line 22
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->S:Ljava/util/List;

    .line 23
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    .line 24
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Y:Ljava/util/LinkedList;

    .line 25
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Z:Ljava/util/HashMap;

    .line 26
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->aa:Z

    .line 27
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ab:Z

    .line 28
    iput-object p2, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mMediaType:Lcom/beizi/ad/internal/j;

    .line 29
    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->getHeaders()Ljava/util/Map;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Ljava/util/Map;)V

    .line 30
    :try_start_0
    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->getResponseBinaryBody()Ljava/io/ByteArrayOutputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/beizi/ad/c/b$i;->a([B)Lcom/beizi/ad/c/b$i;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Lcom/beizi/ad/c/b$i;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 31
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 69
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->d:I

    const/4 v1, 0x1

    .line 70
    iput v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->e:I

    .line 71
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->f:I

    .line 72
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->g:I

    .line 73
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    .line 74
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    .line 75
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->j:Z

    .line 76
    iput-boolean v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    .line 77
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->l:Z

    .line 78
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->m:Z

    .line 79
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->n:Z

    .line 80
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->o:Z

    .line 81
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->p:I

    .line 82
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->q:I

    .line 83
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->r:Z

    .line 84
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->s:I

    .line 85
    new-instance v1, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-direct {v1}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    .line 86
    new-instance v1, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-direct {v1}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    .line 87
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->v:Z

    .line 88
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->x:Z

    .line 89
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->S:Ljava/util/List;

    .line 90
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    .line 91
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Y:Ljava/util/LinkedList;

    .line 92
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Z:Ljava/util/HashMap;

    .line 93
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->aa:Z

    .line 94
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ab:Z

    .line 95
    iput-boolean p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ab:Z

    return-void
.end method

.method private a(Lcom/beizi/ad/c/b$a;)Ljava/lang/String;
    .locals 7

    .line 41
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$a;->a()Lcom/beizi/ad/c/e$f;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/c/e$f;->d:Lcom/beizi/ad/c/e$f;

    const-string v2, ""

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/beizi/ad/c/b$a;->a()Lcom/beizi/ad/c/e$f;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/c/e$f;->c:Lcom/beizi/ad/c/e$f;

    if-eq v0, v1, :cond_0

    return-object v2

    .line 42
    :cond_0
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$a;->a()Lcom/beizi/ad/c/e$f;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/c/e$f;->c:Lcom/beizi/ad/c/e$f;

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    .line 43
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$a;->d()I

    move-result v0

    if-lez v0, :cond_1

    .line 44
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$a;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/c/b$e;

    invoke-virtual {p1}, Lcom/beizi/ad/c/b$e;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "<!DOCTYPE html>\n<html lang=\"en\" style=\"width: 100%; height: 100%;\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" id=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1\">\n    <title>Document</title>\n</head>\n<body style=\"width: 100%; height: 100%; padding: 0; margin: 0;\">\n<img style=\"width: 100%; height: 100%\" src=\"__IMAGE_SRC_PATH__\" alt=\"\"/>\n</body>\n</html><!DOCTYPE html>"

    const-string v1, "__IMAGE_SRC_PATH__"

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "\\{(\\d+)\\.value\\}"

    .line 45
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 46
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 47
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v4, 0x0

    .line 48
    :goto_0
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$a;->d()I

    move-result v5

    if-ge v4, v5, :cond_2

    .line 49
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1}, Lcom/beizi/ad/c/b$a;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/beizi/ad/c/b$e;

    invoke-virtual {v6}, Lcom/beizi/ad/c/b$e;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 50
    :cond_2
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    .line 51
    :goto_1
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    .line 52
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 53
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 54
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, p1, v4}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {v0, p1, v2}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    .line 56
    sget-object v4, Lcom/beizi/ad/internal/utilities/HaoboLog;->pbLogTag:Ljava/lang/String;

    sget v5, Lcom/beizi/ad/R$string;->invalid_string_placeholder:I

    .line 57
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 58
    invoke-static {v4, v5}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 59
    :cond_4
    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 60
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/internal/network/ServerResponse;)Ljava/util/LinkedList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    return-object p0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .line 62
    :try_start_0
    invoke-direct {p0}, Lcom/beizi/ad/internal/network/ServerResponse;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->c(Landroid/content/Context;)V

    return-void

    .line 64
    :cond_0
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->A:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 65
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/beizi/ad/lance/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/beizi/ad/lance/a/h;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 67
    iget-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz p1, :cond_2

    .line 68
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b$b;->a()Ljava/util/List;

    move-result-object p1

    .line 69
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 70
    invoke-direct {p0, p1, v0}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Landroid/content/Context;I)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    const/4 v2, 0x5

    if-ne v0, v2, :cond_8

    .line 71
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->E:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/beizi/ad/lance/a/j;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->E:Ljava/lang/String;

    const-string v2, "market://"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    .line 72
    :cond_4
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->c(Landroid/content/Context;)V

    goto :goto_2

    .line 73
    :cond_5
    :goto_1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->x:Z

    if-eqz v0, :cond_7

    .line 74
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->E:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 75
    iget-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz p1, :cond_6

    .line 76
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b$b;->a()Ljava/util/List;

    move-result-object p1

    .line 77
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V

    :cond_6
    return-void

    .line 78
    :cond_7
    invoke-direct {p0, p1, v1}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Landroid/content/Context;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    return-void

    :catch_0
    move-exception p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    return-void
.end method

.method private a(Landroid/content/Context;I)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    .line 80
    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/beizi/ad/lance/a/h;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    const-string v4, ""

    if-eqz v3, :cond_0

    .line 81
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    :cond_0
    move-object v9, v4

    .line 82
    new-instance v3, Lcom/beizi/ad/lance/ApkBean;

    iget-object v6, v1, Lcom/beizi/ad/internal/network/ServerResponse;->E:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v1, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".apk"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v1, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    iget-object v10, v1, Lcom/beizi/ad/internal/network/ServerResponse;->B:Ljava/lang/String;

    iget-object v11, v1, Lcom/beizi/ad/internal/network/ServerResponse;->D:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".fileprovider"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    iget-object v13, v1, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    iget-object v14, v1, Lcom/beizi/ad/internal/network/ServerResponse;->F:Ljava/lang/String;

    iget-object v15, v1, Lcom/beizi/ad/internal/network/ServerResponse;->G:Ljava/lang/String;

    iget-object v4, v1, Lcom/beizi/ad/internal/network/ServerResponse;->H:Ljava/lang/String;

    iget-object v5, v1, Lcom/beizi/ad/internal/network/ServerResponse;->I:Ljava/lang/String;

    iget-object v0, v1, Lcom/beizi/ad/internal/network/ServerResponse;->J:Ljava/lang/String;

    iget-object v2, v1, Lcom/beizi/ad/internal/network/ServerResponse;->K:Ljava/lang/String;

    move-object/from16 v19, v2

    iget-object v2, v1, Lcom/beizi/ad/internal/network/ServerResponse;->L:Ljava/lang/String;

    move-object/from16 v17, v5

    move-object v5, v3

    move-object/from16 v16, v4

    move-object/from16 v18, v0

    move-object/from16 v20, v2

    invoke-direct/range {v5 .. v20}, Lcom/beizi/ad/lance/ApkBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/beizi/ad/c/b$b$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "apkBean"

    .line 85
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v2, "type"

    move/from16 v3, p2

    .line 86
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "isCanJump"

    .line 87
    iget-boolean v4, v1, Lcom/beizi/ad/internal/network/ServerResponse;->N:Z

    invoke-virtual {v0, v2, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/4 v2, 0x2

    if-ne v3, v2, :cond_2

    .line 88
    iget-object v2, v1, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz v2, :cond_1

    const-string v3, "openList"

    .line 89
    invoke-virtual {v2}, Lcom/beizi/ad/c/b$b$b;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1
    const-string v2, "landingPageUrl"

    .line 90
    iget-object v3, v1, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    :cond_2
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/beizi/ad/internal/activity/BeiZiDownloadDialogActivity;

    move-object/from16 v4, p1

    invoke-direct {v2, v4, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "data"

    .line 92
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    .line 93
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 94
    invoke-virtual {v4, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private a(Lcom/beizi/ad/c/b$b;)V
    .locals 1

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->O:Lcom/beizi/ad/c/b$b;

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->l()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->P:Ljava/util/List;

    .line 4
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->k()Lcom/beizi/ad/c/b$b$c;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->y:Lcom/beizi/ad/c/b$b$c;

    .line 5
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->j()Lcom/beizi/ad/c/b$b$b;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->c()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->A:I

    .line 7
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->B:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->D:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->E:Ljava/lang/String;

    .line 11
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "lance"

    .line 12
    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->B:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "BeiZi"

    .line 14
    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->B:Ljava/lang/String;

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->D:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Ad Download"

    .line 16
    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->D:Ljava/lang/String;

    .line 17
    :cond_2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->F:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->G:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->H:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->I:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->q()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->J:Ljava/lang/String;

    .line 22
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->r()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->K:Ljava/lang/String;

    .line 23
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->s()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->L:Ljava/lang/String;

    .line 24
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->t()Lcom/beizi/ad/c/b$b$a;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->M:Lcom/beizi/ad/c/b$b$a;

    if-eqz p1, :cond_3

    .line 25
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b$a;->a()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 26
    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->N:Z

    :cond_3
    return-void
.end method

.method private a(Lcom/beizi/ad/c/b$i;)V
    .locals 2

    .line 34
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->b(Lcom/beizi/ad/c/b$i;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mMediaType:Lcom/beizi/ad/internal/j;

    sget-object v1, Lcom/beizi/ad/internal/j;->f:Lcom/beizi/ad/internal/j;

    if-ne v0, v1, :cond_1

    .line 36
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->d(Lcom/beizi/ad/c/b$i;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 37
    :cond_1
    sget-object v1, Lcom/beizi/ad/internal/j;->e:Lcom/beizi/ad/internal/j;

    if-eq v0, v1, :cond_2

    .line 38
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->c(Lcom/beizi/ad/c/b$i;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 39
    :cond_2
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->e(Lcom/beizi/ad/c/b$i;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 40
    :cond_3
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse;->f(Lcom/beizi/ad/c/b$i;)Z

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .line 102
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 103
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "Headline"

    .line 104
    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/JsonUtil;->getJSONString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ac:Ljava/lang/String;

    const-string p1, "Body"

    .line 105
    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/JsonUtil;->getJSONString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ad:Ljava/lang/String;

    const-string p1, "AppIcon"

    .line 106
    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/JsonUtil;->getJSONString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ag:Ljava/lang/String;

    const-string p1, "Images"

    .line 107
    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/JsonUtil;->getJSONArray(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const-string v1, "Videos"

    .line 108
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/JsonUtil;->getJSONArray(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 109
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 110
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->af:Ljava/lang/String;

    :cond_1
    if-eqz v0, :cond_2

    .line 111
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-lez p1, :cond_2

    .line 112
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ae:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 113
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    .line 96
    new-instance v0, Landroid/content/Intent;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v1, 0x10000000

    .line 97
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 98
    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 99
    :catch_0
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->opening_url_failed:I

    .line 100
    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 101
    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private a(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 27
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 28
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 29
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 30
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 31
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->response_header:I

    .line 32
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v4, v5, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 33
    invoke-static {v3, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/beizi/ad/internal/g;->c()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/beizi/ad/internal/network/ServerResponse$1;

    invoke-direct {v2, p0, v0}, Lcom/beizi/ad/internal/network/ServerResponse$1;-><init>(Lcom/beizi/ad/internal/network/ServerResponse;Lcom/beizi/ad/internal/g;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bzopen"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    .line 10
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "android.intent.action.MAIN"

    .line 11
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.category.LAUNCHER"

    .line 12
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "flags"

    .line 13
    invoke-virtual {v0, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x2

    if-nez v3, :cond_3

    :try_start_0
    const-string v3, "0x"

    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "0X"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 16
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_1

    .line 17
    :cond_2
    :goto_0
    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 19
    :cond_3
    :goto_1
    new-instance v2, Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v2, v3, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v2, "rect"

    .line 21
    invoke-virtual {v0, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    :try_start_1
    const-string v2, ":"

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 24
    array-length v2, v0

    const/4 v3, 0x4

    if-ne v2, v3, :cond_4

    .line 25
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 26
    aget-object v3, v0, v6

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v5, 0x1

    aget-object v5, v0, v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    aget-object v4, v0, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x3

    aget-object v0, v0, v6

    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 28
    invoke-virtual {v2, v3, v5, v4, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 29
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setSourceBounds(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 31
    :cond_4
    :goto_2
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_3

    .line 32
    :cond_5
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const v0, 0x30008000

    .line 33
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 34
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_3
    return-void
.end method

.method private b(Lcom/beizi/ad/c/b$i;)Z
    .locals 3

    .line 4
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->b()I

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->response_error:I

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private c(Landroid/content/Context;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 93
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->v:Z

    if-eqz v0, :cond_1

    .line 94
    invoke-static {}, Lcom/beizi/ad/AdActivity;->a()Ljava/lang/Class;

    move-result-object v0

    .line 95
    :try_start_0
    new-instance v1, Landroid/webkit/WebView;

    new-instance v2, Landroid/content/MutableContextWrapper;

    invoke-direct {v2, p1}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 96
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->setWebViewSettings(Landroid/webkit/WebView;)V

    .line 97
    iget-object v2, p0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/lance/a/i;->a()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 98
    sget-object v2, Lcom/beizi/ad/internal/activity/a;->a:Ljava/util/LinkedList;

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 99
    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/ad/internal/g;->e()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x10000000

    .line 100
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v2, "ACTIVITY_TYPE"

    const-string v3, "DOWNLOADBROWSER"

    .line 101
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "ACTIVITY_CAN_JUMP"

    .line 102
    iget-boolean v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->N:Z

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 103
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 104
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception initializing the redirect webview: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 105
    :catch_1
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->adactivity_missing:I

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    sget-object p1, Lcom/beizi/ad/internal/activity/a;->a:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    goto :goto_0

    .line 107
    :cond_1
    :try_start_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    iget-object v2, p0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 108
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :catch_2
    :cond_2
    :goto_0
    return-void
.end method

.method private c()Z
    .locals 3

    .line 84
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->E:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->B:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 86
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->G:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 87
    :cond_2
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->F:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    .line 88
    :cond_3
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->J:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    .line 89
    :cond_4
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->L:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    .line 90
    :cond_5
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->I:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->H:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    .line 91
    :cond_6
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->A:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_8

    const/4 v2, 0x5

    if-ne v0, v2, :cond_7

    goto :goto_0

    :cond_7
    return v1

    :cond_8
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private c(Lcom/beizi/ad/c/b$i;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->a()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_15

    .line 2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/c/b$j;

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->a:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->b:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->c()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->c:Lcom/beizi/ad/c/e$a;

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->d()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->d:I

    .line 7
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->e()Lcom/beizi/ad/c/e$h;

    move-result-object v0

    sget-object v3, Lcom/beizi/ad/c/e$h;->b:Lcom/beizi/ad/c/e$h;

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 8
    :goto_0
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->e:I

    .line 9
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    .line 10
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    .line 11
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->h()Lcom/beizi/ad/c/b$g;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {p0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdType()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    sget-object v3, Lcom/beizi/ad/c/e$a;->d:Lcom/beizi/ad/c/e$a;

    if-eq v0, v3, :cond_1

    .line 13
    invoke-virtual {p0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdType()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    sget-object v3, Lcom/beizi/ad/c/e$a;->f:Lcom/beizi/ad/c/e$a;

    if-ne v0, v3, :cond_2

    .line 14
    :cond_1
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->h()Lcom/beizi/ad/c/b$g;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->f:I

    .line 16
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->g:I

    goto :goto_1

    .line 17
    :cond_2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdType()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    sget-object v3, Lcom/beizi/ad/c/e$a;->b:Lcom/beizi/ad/c/e$a;

    if-ne v0, v3, :cond_3

    .line 18
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "REWARD_ITEM"

    invoke-virtual {p0, v3, v0}, Lcom/beizi/ad/internal/network/ServerResponse;->addToExtras(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->o()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->j:Z

    .line 20
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->m()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    .line 21
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->q()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->l:Z

    .line 22
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->n()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->m:Z

    .line 23
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->n:Z

    .line 24
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->k()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->o:Z

    .line 25
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->l()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->p:I

    .line 26
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->j()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->q:I

    .line 27
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->r:Z

    .line 28
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->r()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_4

    .line 30
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/ad/c/b$d;

    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->i()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->w:Ljava/lang/String;

    .line 31
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/c/b$d;

    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->R:Ljava/lang/String;

    .line 32
    :cond_4
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->j:Z

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    if-nez v0, :cond_5

    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    if-nez v0, :cond_5

    const/16 v0, 0x2d0

    .line 33
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    const/16 v0, 0x500

    .line 34
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    .line 35
    :cond_5
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->s()I

    move-result v0

    if-lez v0, :cond_16

    .line 36
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->r()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/ad/c/b$d;

    if-nez v0, :cond_7

    .line 37
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->b()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->R:Ljava/lang/String;

    .line 38
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mAdid = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->R:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "BeiZisAd"

    invoke-static {v5, v4}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    :cond_7
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->h()I

    move-result v4

    if-lez v4, :cond_8

    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->g()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_14

    .line 40
    :cond_8
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->a()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Q:Ljava/lang/String;

    .line 41
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->e()Lcom/beizi/ad/c/b$c;

    move-result-object v4

    if-eqz v4, :cond_b

    .line 42
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$c;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_9

    .line 43
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v4}, Lcom/beizi/ad/c/b$c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$100(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Ljava/lang/String;)V

    .line 44
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    sget v6, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_PIC:I

    invoke-static {v5, v6}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$200(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;I)V

    goto :goto_2

    .line 45
    :cond_9
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v4}, Lcom/beizi/ad/c/b$c;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$100(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Ljava/lang/String;)V

    .line 46
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    sget v6, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_TEXT:I

    invoke-static {v5, v6}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$200(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;I)V

    .line 47
    :goto_2
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$c;->c()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_a

    .line 48
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v4}, Lcom/beizi/ad/c/b$c;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$100(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Ljava/lang/String;)V

    .line 49
    iget-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    sget v5, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_PIC:I

    invoke-static {v4, v5}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$200(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;I)V

    goto :goto_3

    .line 50
    :cond_a
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v4}, Lcom/beizi/ad/c/b$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$100(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Ljava/lang/String;)V

    .line 51
    iget-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    sget v5, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_TEXT:I

    invoke-static {v4, v5}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$200(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;I)V

    .line 52
    :cond_b
    :goto_3
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->d()I

    move-result v4

    if-lez v4, :cond_11

    .line 53
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->f()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/beizi/ad/c/b$a;

    .line 54
    iget-boolean v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    if-eqz v6, :cond_e

    const/4 v6, 0x0

    .line 55
    :goto_5
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$a;->d()I

    move-result v7

    if-ge v6, v7, :cond_e

    .line 56
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$a;->c()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/beizi/ad/c/b$e;

    invoke-virtual {v7}, Lcom/beizi/ad/c/b$e;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_d

    .line 57
    iget-object v7, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$a;->c()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/beizi/ad/c/b$e;

    invoke-virtual {v8}, Lcom/beizi/ad/c/b$e;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_d
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 58
    :cond_e
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v6}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Ljava/lang/String;)V

    .line 59
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$a;->a()Lcom/beizi/ad/c/e$f;

    move-result-object v6

    sget-object v7, Lcom/beizi/ad/c/e$f;->b:Lcom/beizi/ad/c/e$f;

    if-eq v6, v7, :cond_f

    .line 60
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$a;->a()Lcom/beizi/ad/c/e$f;

    move-result-object v6

    sget-object v7, Lcom/beizi/ad/c/e$f;->f:Lcom/beizi/ad/c/e$f;

    if-ne v6, v7, :cond_10

    .line 61
    :cond_f
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$a;->d()I

    move-result v6

    if-lez v6, :cond_10

    .line 62
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->S:Ljava/util/List;

    sget-object v7, Lcom/beizi/ad/internal/i;->a:Lcom/beizi/ad/internal/i;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$a;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/beizi/ad/c/b$e;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$e;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 63
    :cond_10
    invoke-direct {p0, v5}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Lcom/beizi/ad/c/b$a;)Ljava/lang/String;

    move-result-object v5

    .line 64
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->S:Ljava/util/List;

    sget-object v7, Lcom/beizi/ad/internal/i;->b:Lcom/beizi/ad/internal/i;

    invoke-static {v7, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v6, "mraid.js"

    .line 65
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 66
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v6, "MRAID"

    invoke-virtual {p0, v6, v5}, Lcom/beizi/ad/internal/network/ServerResponse;->addToExtras(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 67
    :cond_11
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->c()Lcom/beizi/ad/c/b$b;

    move-result-object v4

    if-eqz v4, :cond_14

    .line 68
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->c()Lcom/beizi/ad/c/b$b;

    move-result-object v3

    .line 69
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Lcom/beizi/ad/c/b$b;)V

    .line 70
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$b;->a()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    .line 71
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$b;->h()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->W:Ljava/lang/String;

    .line 72
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$b;->b()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    .line 73
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$b;->i()Lcom/beizi/ad/c/b$h;

    move-result-object v3

    if-eqz v3, :cond_12

    .line 74
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_12

    .line 75
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectViewUrl:Ljava/lang/String;

    :cond_12
    if-eqz v3, :cond_13

    .line 76
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_13

    .line 77
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    :cond_13
    if-eqz v3, :cond_14

    .line 78
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$h;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_14

    .line 79
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$h;->c()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->T:Ljava/lang/String;

    :cond_14
    add-int/lit8 v0, v0, 0x1

    .line 80
    iget-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->S:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_6

    .line 81
    :cond_15
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->blank_ad:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :cond_16
    :goto_6
    iget-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->S:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_17

    .line 83
    iput-boolean v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->aa:Z

    return v1

    :cond_17
    return v2
.end method

.method private d(Lcom/beizi/ad/c/b$i;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->a()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_5

    .line 2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/c/b$j;

    .line 3
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$j;->m()Z

    move-result v2

    iput-boolean v2, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    .line 4
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$j;->s()I

    move-result v2

    if-lez v2, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$j;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/ad/c/b$d;

    .line 6
    invoke-virtual {v2}, Lcom/beizi/ad/c/b$d;->h()I

    move-result v3

    if-lez v3, :cond_2

    invoke-virtual {v2}, Lcom/beizi/ad/c/b$d;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    .line 7
    :cond_2
    invoke-virtual {v2}, Lcom/beizi/ad/c/b$d;->d()I

    move-result v3

    if-lez v3, :cond_1

    .line 8
    invoke-virtual {v2}, Lcom/beizi/ad/c/b$d;->f()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/ad/c/b$a;

    .line 9
    iget-boolean v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    .line 10
    :goto_0
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$a;->d()I

    move-result v5

    if-ge v4, v5, :cond_3

    .line 11
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$a;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/beizi/ad/c/b$e;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$e;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 12
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    invoke-virtual {v3}, Lcom/beizi/ad/c/b$a;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/beizi/ad/c/b$e;

    invoke-virtual {v6}, Lcom/beizi/ad/c/b$e;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 13
    :cond_5
    iget-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->aa:Z

    return p1

    :cond_6
    return v1
.end method

.method private e(Lcom/beizi/ad/c/b$i;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->a()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_11

    .line 2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/c/b$j;

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->a:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->b:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->c()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->c:Lcom/beizi/ad/c/e$a;

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->d()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->d:I

    .line 7
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->e()Lcom/beizi/ad/c/e$h;

    move-result-object v0

    sget-object v3, Lcom/beizi/ad/c/e$h;->b:Lcom/beizi/ad/c/e$h;

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 8
    :goto_0
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->e:I

    .line 9
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    .line 10
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    .line 11
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->r()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_1

    .line 13
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/ad/c/b$d;

    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->i()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->w:Ljava/lang/String;

    .line 14
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/c/b$d;

    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->R:Ljava/lang/String;

    .line 15
    :cond_1
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->o()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->j:Z

    .line 16
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->m()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    .line 17
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->q()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->l:Z

    .line 18
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->n()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->m:Z

    .line 19
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->n:Z

    .line 20
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->k()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->o:Z

    .line 21
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->l()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->p:I

    .line 22
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->j()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->q:I

    .line 23
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->r:Z

    .line 24
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->j:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    if-nez v0, :cond_2

    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    if-nez v0, :cond_2

    const/16 v0, 0x2d0

    .line 25
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    const/16 v0, 0x500

    .line 26
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    .line 27
    :cond_2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->s()I

    move-result v0

    if-lez v0, :cond_12

    .line 28
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->r()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/c/b$d;

    .line 29
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->h()I

    move-result v3

    if-lez v3, :cond_4

    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_3

    .line 30
    :cond_4
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Q:Ljava/lang/String;

    .line 31
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->d()I

    move-result v3

    if-ltz v3, :cond_3

    .line 32
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/beizi/ad/c/b$a;

    .line 33
    iget-boolean v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    if-eqz v5, :cond_7

    const/4 v5, 0x0

    .line 34
    :goto_1
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$a;->d()I

    move-result v6

    if-ge v5, v6, :cond_7

    .line 35
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$a;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/beizi/ad/c/b$e;

    invoke-virtual {v6}, Lcom/beizi/ad/c/b$e;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_6

    .line 36
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    invoke-virtual {v4}, Lcom/beizi/ad/c/b$a;->c()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/beizi/ad/c/b$e;

    invoke-virtual {v7}, Lcom/beizi/ad/c/b$e;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 37
    :cond_7
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$a;->a()Lcom/beizi/ad/c/e$f;

    move-result-object v5

    sget-object v6, Lcom/beizi/ad/c/e$f;->e:Lcom/beizi/ad/c/e$f;

    if-ne v5, v6, :cond_5

    .line 38
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$a;->d()I

    move-result v5

    if-lez v5, :cond_5

    .line 39
    :try_start_0
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->e()Lcom/beizi/ad/c/b$c;

    move-result-object v5

    if-eqz v5, :cond_a

    .line 40
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$c;->a()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_8

    .line 41
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$100(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Ljava/lang/String;)V

    .line 42
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    sget v7, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_PIC:I

    invoke-static {v6, v7}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$200(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;I)V

    goto :goto_2

    .line 43
    :cond_8
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$c;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$100(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Ljava/lang/String;)V

    .line 44
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    sget v7, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_TEXT:I

    invoke-static {v6, v7}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$200(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;I)V

    .line 45
    :goto_2
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$c;->c()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_9

    .line 46
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$c;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$100(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Ljava/lang/String;)V

    .line 47
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    sget v6, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_PIC:I

    invoke-static {v5, v6}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$200(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;I)V

    goto :goto_3

    .line 48
    :cond_9
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$c;->d()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$100(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Ljava/lang/String;)V

    .line 49
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    sget v6, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_TEXT:I

    invoke-static {v5, v6}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->access$200(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;I)V

    .line 50
    :cond_a
    :goto_3
    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {v4}, Lcom/beizi/ad/c/b$a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lcom/beizi/ad/internal/nativead/a;->a(Lorg/json/JSONObject;)Lcom/beizi/ad/internal/nativead/a;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    .line 51
    invoke-virtual {p0}, Lcom/beizi/ad/internal/network/ServerResponse;->getLogoUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/beizi/ad/internal/nativead/a;->b(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;)V

    .line 52
    iget-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    invoke-virtual {p0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;)V

    .line 53
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->c()Lcom/beizi/ad/c/b$b;

    move-result-object v4

    if-eqz v4, :cond_10

    .line 54
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->c()Lcom/beizi/ad/c/b$b;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Lcom/beizi/ad/c/b$b;)V

    .line 55
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->c()Lcom/beizi/ad/c/b$b;

    move-result-object v4

    .line 56
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$b;->a()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    .line 57
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$b;->b()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    .line 58
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$b;->h()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->W:Ljava/lang/String;

    .line 59
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    invoke-static {v6}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_b

    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    goto :goto_4

    :cond_b
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->W:Ljava/lang/String;

    :goto_4
    invoke-virtual {v5, v6}, Lcom/beizi/ad/internal/nativead/a;->b(Ljava/lang/String;)V

    .line 60
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/beizi/ad/internal/nativead/a;->c(Ljava/lang/String;)V

    .line 61
    iget-object v5, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->c()Lcom/beizi/ad/c/b$b;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/c/b$b;)V

    .line 62
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$b;->i()Lcom/beizi/ad/c/b$h;

    move-result-object v5

    if-eqz v5, :cond_c

    .line 63
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_c

    .line 64
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/beizi/ad/internal/nativead/a;->d(Ljava/lang/String;)V

    :cond_c
    if-eqz v5, :cond_d

    .line 65
    invoke-virtual {v5}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_d

    .line 66
    iget-object v6, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    invoke-virtual {v5}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/beizi/ad/internal/nativead/a;->e(Ljava/lang/String;)V

    .line 67
    :cond_d
    invoke-virtual {v4}, Lcom/beizi/ad/c/b$b;->l()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_10

    .line 68
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_10

    const/4 v5, 0x0

    .line 69
    :goto_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_10

    .line 70
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/beizi/ad/c/b$h;

    invoke-virtual {v6}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v6

    .line 71
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_e

    .line 72
    iget-object v7, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    invoke-virtual {v7, v6}, Lcom/beizi/ad/internal/nativead/a;->e(Ljava/lang/String;)V

    .line 73
    :cond_e
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/beizi/ad/c/b$h;

    invoke-virtual {v6}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v6

    .line 74
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_f

    .line 75
    iget-object v7, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    invoke-virtual {v7, v6}, Lcom/beizi/ad/internal/nativead/a;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_f
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :catch_0
    nop

    .line 76
    :cond_10
    iget-object v4, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    if-eqz v4, :cond_5

    .line 77
    iput-boolean v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->aa:Z

    return v1

    .line 78
    :cond_11
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->blank_ad:I

    .line 79
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    :cond_12
    iget-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->S:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_13

    .line 82
    iput-boolean v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->aa:Z

    return v1

    :cond_13
    return v2
.end method

.method private f(Lcom/beizi/ad/c/b$i;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->a()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_7

    .line 2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$i;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/c/b$j;

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->r()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 5
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/c/b$d;

    .line 6
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->c()Lcom/beizi/ad/c/b$b;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->c()Lcom/beizi/ad/c/b$b;

    move-result-object v0

    .line 8
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Lcom/beizi/ad/c/b$b;)V

    .line 9
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$b;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    .line 10
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$b;->h()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->W:Ljava/lang/String;

    .line 11
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$b;->i()Lcom/beizi/ad/c/b$h;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 12
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 13
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectViewUrl:Ljava/lang/String;

    :cond_0
    if-eqz v0, :cond_1

    .line 14
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 15
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    :cond_1
    if-eqz v0, :cond_2

    .line 16
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$h;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 17
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$h;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->T:Ljava/lang/String;

    .line 18
    :cond_2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->a:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->b:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->c()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->c:Lcom/beizi/ad/c/e$a;

    .line 21
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->d()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->d:I

    .line 22
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->e()Lcom/beizi/ad/c/e$h;

    move-result-object v0

    sget-object v3, Lcom/beizi/ad/c/e$h;->b:Lcom/beizi/ad/c/e$h;

    if-ne v0, v3, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x2

    .line 23
    :goto_0
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->e:I

    .line 24
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    .line 25
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    .line 26
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->r()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_4

    .line 28
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/ad/c/b$d;

    invoke-virtual {v3}, Lcom/beizi/ad/c/b$d;->i()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->w:Ljava/lang/String;

    .line 29
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/c/b$d;

    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->R:Ljava/lang/String;

    .line 30
    :cond_4
    iput v2, p0, Lcom/beizi/ad/internal/network/ServerResponse;->f:I

    .line 31
    iput v2, p0, Lcom/beizi/ad/internal/network/ServerResponse;->g:I

    .line 32
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->h()Lcom/beizi/ad/c/b$g;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdType()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    sget-object v3, Lcom/beizi/ad/c/e$a;->d:Lcom/beizi/ad/c/e$a;

    if-ne v0, v3, :cond_5

    .line 33
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->h()Lcom/beizi/ad/c/b$g;

    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->f:I

    .line 35
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->g:I

    .line 36
    :cond_5
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->s()I

    move-result v0

    if-lez v0, :cond_7

    .line 37
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$j;->r()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/c/b$d;

    .line 38
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->h()I

    move-result v3

    if-lez v3, :cond_6

    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 39
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$d;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/c/b$f;

    .line 40
    iget-object v3, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Y:Ljava/util/LinkedList;

    new-instance v11, Lcom/beizi/ad/internal/a/a;

    invoke-virtual {v0}, Lcom/beizi/ad/c/b$f;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/beizi/ad/c/b$f;->c()Ljava/lang/String;

    move-result-object v6

    iget v7, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    iget v8, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    invoke-virtual {v0}, Lcom/beizi/ad/c/b$f;->b()Ljava/lang/String;

    move-result-object v9

    const-string v10, ""

    move-object v4, v11

    invoke-direct/range {v4 .. v10}, Lcom/beizi/ad/internal/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 41
    :cond_7
    iget-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Y:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_8

    .line 42
    iput-boolean v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->aa:Z

    return v1

    :cond_8
    return v2
.end method


# virtual methods
.method a()Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ab:Z

    return v0
.end method

.method public addToExtras(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Z:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public containsAds()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->aa:Z

    return v0
.end method

.method public getAdExtInfo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Q:Ljava/lang/String;

    return-object v0
.end method

.method public getAdId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->R:Ljava/lang/String;

    return-object v0
.end method

.method public getAdInteractInfo()Lcom/beizi/ad/c/b$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->O:Lcom/beizi/ad/c/b$b;

    return-object v0
.end method

.method public getAdOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->e:I

    return v0
.end method

.method public getAdType()Lcom/beizi/ad/c/e$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->c:Lcom/beizi/ad/c/e$a;

    return-object v0
.end method

.method public getAdUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->t:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    return-object v0
.end method

.method public getApkName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->B:Ljava/lang/String;

    return-object v0
.end method

.method public getAppDesc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->D:Ljava/lang/String;

    return-object v0
.end method

.method public getAppDeveloper()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->G:Ljava/lang/String;

    return-object v0
.end method

.method public getAppDownloadURL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->E:Ljava/lang/String;

    return-object v0
.end method

.method public getAppIcon()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ag:Ljava/lang/String;

    return-object v0
.end method

.method public getAppIconURL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->K:Ljava/lang/String;

    return-object v0
.end method

.method public getAppPermissionsDesc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->H:Ljava/lang/String;

    return-object v0
.end method

.method public getAppPermissionsUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->I:Ljava/lang/String;

    return-object v0
.end method

.method public getAppPrivacyUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->J:Ljava/lang/String;

    return-object v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->F:Ljava/lang/String;

    return-object v0
.end method

.method public getAppintro()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->L:Ljava/lang/String;

    return-object v0
.end method

.method public getCreatives()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/beizi/ad/internal/i;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->S:Ljava/util/List;

    return-object v0
.end method

.method public getExtras()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Z:Ljava/util/HashMap;

    return-object v0
.end method

.method public getFollowTrackExt()Lcom/beizi/ad/c/b$b$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->h:I

    return v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->af:Ljava/lang/String;

    return-object v0
.end method

.method public getInteractType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->A:I

    return v0
.end method

.method public getLeft()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->f:I

    return v0
.end method

.method public getLogoUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->u:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    return-object v0
.end method

.method public getMaxTimer()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->q:I

    return v0
.end method

.method public getMediationAds()Ljava/util/LinkedList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedList<",
            "Lcom/beizi/ad/internal/a/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->Y:Ljava/util/LinkedList;

    return-object v0
.end method

.method public getMinTimer()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->p:I

    return v0
.end method

.method public getNativeAdResponse()Lcom/beizi/ad/NativeAdResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ah:Lcom/beizi/ad/internal/nativead/a;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    return-object v0
.end method

.method public getPrefetchResources()Ljava/util/LinkedList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->X:Ljava/util/LinkedList;

    return-object v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->w:Ljava/lang/String;

    return-object v0
.end method

.method public getRefreshInterval()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->d:I

    return v0
.end method

.method public getSubTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ad:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ac:Ljava/lang/String;

    return-object v0
.end method

.method public getTop()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->g:I

    return v0
.end method

.method public getVideoTrackExt()Lcom/beizi/ad/c/b$b$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->y:Lcom/beizi/ad/c/b$b$c;

    return-object v0
.end method

.method public getVideoUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ae:Ljava/lang/String;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->i:I

    return v0
.end method

.method public handleClick(Landroid/view/View;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleClick========"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "BeiZisAd"

    invoke-static {v4, v3}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    if-nez v2, :cond_4

    .line 37
    iget-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    invoke-static {v2}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_0

    .line 38
    iget-object v6, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    const-string v10, ""

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move/from16 v11, p7

    invoke-static/range {v6 .. v11}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    .line 39
    new-instance v2, Lcom/beizi/ad/internal/h;

    iget-object v6, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    invoke-direct {v2, v6}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    new-array v6, v5, [Ljava/lang/Void;

    invoke-virtual {v2, v6}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    const-string v2, ""

    .line 40
    iput-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    .line 41
    :cond_0
    iget-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->O:Lcom/beizi/ad/c/b$b;

    if-eqz v2, :cond_4

    .line 42
    iget-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->P:Ljava/util/List;

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    .line 43
    :goto_0
    iget-object v6, v0, Lcom/beizi/ad/internal/network/ServerResponse;->P:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v2, v6, :cond_3

    .line 44
    iget-object v6, v0, Lcom/beizi/ad/internal/network/ServerResponse;->P:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/beizi/ad/c/b$h;

    if-eqz v6, :cond_2

    .line 45
    invoke-virtual {v6}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 46
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    .line 47
    invoke-virtual {v6}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v8

    const-string v12, ""

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move/from16 v13, p7

    invoke-static/range {v8 .. v13}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "__REQUESTUUID__"

    move-object/from16 v8, p6

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    .line 48
    invoke-virtual {v6}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v9

    const-string v13, ""

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move/from16 v14, p7

    invoke-static/range {v9 .. v14}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    .line 49
    :goto_1
    new-instance v7, Lcom/beizi/ad/internal/h;

    invoke-static {v1, v6}, Lcom/beizi/ad/internal/utilities/StringUtil;->replaceClick(Landroid/view/View;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v6}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object v6

    invoke-virtual {v6}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    new-array v9, v5, [Ljava/lang/Void;

    invoke-virtual {v7, v6, v9}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 50
    :cond_3
    iput-object v3, v0, Lcom/beizi/ad/internal/network/ServerResponse;->P:Ljava/util/List;

    .line 51
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mDeepLinkUrl:"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ",appDownloadURL = "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/beizi/ad/internal/network/ServerResponse;->E:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ",mLandingPageUrl = "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_5

    .line 52
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    :cond_5
    if-nez v3, :cond_6

    return-void

    .line 53
    :cond_6
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 54
    :try_start_0
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/beizi/ad/lance/a/j;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    invoke-static {v3, v1}, Lcom/beizi/ad/lance/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_3

    .line 55
    :cond_7
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz v1, :cond_8

    .line 56
    invoke-virtual {v1}, Lcom/beizi/ad/c/b$b$b;->i()Ljava/util/List;

    move-result-object v1

    .line 57
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V

    .line 58
    :cond_8
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Landroid/content/Context;)V

    goto :goto_4

    .line 59
    :cond_9
    :goto_3
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz v1, :cond_a

    .line 60
    invoke-virtual {v1}, Lcom/beizi/ad/c/b$b$b;->h()Ljava/util/List;

    move-result-object v1

    .line 61
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V

    .line 62
    :cond_a
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/network/ServerResponse;->b(Landroid/content/Context;)V

    .line 63
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz v1, :cond_d

    .line 64
    invoke-virtual {v1}, Lcom/beizi/ad/c/b$b$b;->f()Ljava/util/List;

    move-result-object v1

    .line 65
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    nop

    .line 66
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz v1, :cond_b

    .line 67
    invoke-virtual {v1}, Lcom/beizi/ad/c/b$b$b;->g()Ljava/util/List;

    move-result-object v1

    .line 68
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V

    .line 69
    :cond_b
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Landroid/content/Context;)V

    goto :goto_4

    .line 70
    :cond_c
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Landroid/content/Context;)V

    :cond_d
    :goto_4
    return-void
.end method

.method public handleClick(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p8

    .line 1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleClick========"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "BeiZisAd"

    invoke-static {v4, v3}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    if-nez v2, :cond_4

    .line 2
    iget-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    invoke-static {v2}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_0

    .line 3
    iget-object v6, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    const-string v13, ""

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    invoke-static/range {v6 .. v13}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    .line 4
    new-instance v2, Lcom/beizi/ad/internal/h;

    iget-object v6, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    invoke-direct {v2, v6}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    new-array v6, v5, [Ljava/lang/Void;

    invoke-virtual {v2, v6}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    const-string v2, ""

    .line 5
    iput-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectClickUrl:Ljava/lang/String;

    .line 6
    :cond_0
    iget-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->O:Lcom/beizi/ad/c/b$b;

    if-eqz v2, :cond_4

    .line 7
    iget-object v2, v0, Lcom/beizi/ad/internal/network/ServerResponse;->P:Ljava/util/List;

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    .line 8
    :goto_0
    iget-object v6, v0, Lcom/beizi/ad/internal/network/ServerResponse;->P:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v2, v6, :cond_3

    .line 9
    iget-object v6, v0, Lcom/beizi/ad/internal/network/ServerResponse;->P:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/beizi/ad/c/b$h;

    if-eqz v6, :cond_2

    .line 10
    invoke-virtual {v6}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 11
    invoke-static/range {p9 .. p9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    .line 12
    invoke-virtual {v6}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v8

    const-string v15, ""

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    move-object/from16 v13, p6

    move-object/from16 v14, p7

    invoke-static/range {v8 .. v15}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "__REQUESTUUID__"

    move-object/from16 v8, p9

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object/from16 v8, p9

    .line 13
    invoke-virtual {v6}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v9

    const-string v16, ""

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move-object/from16 v14, p6

    move-object/from16 v15, p7

    invoke-static/range {v9 .. v16}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 14
    :goto_1
    new-instance v7, Lcom/beizi/ad/internal/h;

    invoke-static {v1, v6}, Lcom/beizi/ad/internal/utilities/StringUtil;->replaceClick(Landroid/view/View;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v6}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object v6

    invoke-virtual {v6}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    new-array v9, v5, [Ljava/lang/Void;

    invoke-virtual {v7, v6, v9}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_2

    :cond_2
    move-object/from16 v8, p9

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 15
    :cond_3
    iput-object v3, v0, Lcom/beizi/ad/internal/network/ServerResponse;->P:Ljava/util/List;

    .line 16
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mDeepLinkUrl:"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ",appDownloadURL = "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/beizi/ad/internal/network/ServerResponse;->E:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ",mLandingPageUrl = "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/beizi/ad/internal/network/ServerResponse;->U:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_5

    .line 17
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    :cond_5
    if-nez v3, :cond_6

    return-void

    .line 18
    :cond_6
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 19
    :try_start_0
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->V:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/beizi/ad/lance/a/j;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->C:Ljava/lang/String;

    invoke-static {v3, v1}, Lcom/beizi/ad/lance/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_3

    .line 20
    :cond_7
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz v1, :cond_8

    .line 21
    invoke-virtual {v1}, Lcom/beizi/ad/c/b$b$b;->i()Ljava/util/List;

    move-result-object v1

    .line 22
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V

    .line 23
    :cond_8
    invoke-direct {v0, v3}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Landroid/content/Context;)V

    goto :goto_4

    .line 24
    :cond_9
    :goto_3
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz v1, :cond_a

    .line 25
    invoke-virtual {v1}, Lcom/beizi/ad/c/b$b$b;->h()Ljava/util/List;

    move-result-object v1

    .line 26
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V

    .line 27
    :cond_a
    invoke-direct {v0, v3}, Lcom/beizi/ad/internal/network/ServerResponse;->b(Landroid/content/Context;)V

    .line 28
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz v1, :cond_d

    .line 29
    invoke-virtual {v1}, Lcom/beizi/ad/c/b$b$b;->f()Ljava/util/List;

    move-result-object v1

    .line 30
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    nop

    .line 31
    iget-object v1, v0, Lcom/beizi/ad/internal/network/ServerResponse;->z:Lcom/beizi/ad/c/b$b$b;

    if-eqz v1, :cond_b

    .line 32
    invoke-virtual {v1}, Lcom/beizi/ad/c/b$b$b;->g()Ljava/util/List;

    move-result-object v1

    .line 33
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ReportEventUtil;->report(Ljava/util/List;)V

    .line 34
    :cond_b
    invoke-direct {v0, v3}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Landroid/content/Context;)V

    goto :goto_4

    .line 35
    :cond_c
    invoke-direct {v0, v3}, Lcom/beizi/ad/internal/network/ServerResponse;->a(Landroid/content/Context;)V

    :cond_d
    :goto_4
    return-void
.end method

.method public handleConvert(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleClick called with convertUrl = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->T:Ljava/lang/String;

    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Lcom/beizi/ad/internal/h;

    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->T:Ljava/lang/String;

    invoke-direct {p1, v0}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public handleOnCompletion()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->O:Lcom/beizi/ad/c/b$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$b;->l()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/ad/c/b$h;

    .line 5
    invoke-static {v2}, Lcom/beizi/ad/internal/utilities/UrlUtil;->sendOnCompletionInfoToServer(Lcom/beizi/ad/c/b$h;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public handleOnPause(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->O:Lcom/beizi/ad/c/b$b;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->l()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/beizi/ad/c/b$h;

    .line 5
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/UrlUtil;->sendOnPauseInfoToServer(Lcom/beizi/ad/c/b$h;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public handleOnStart(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->O:Lcom/beizi/ad/c/b$b;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/beizi/ad/c/b$b;->l()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 4
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/c/b$h;

    .line 5
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/UrlUtil;->sendOnStartInfoToServer(Lcom/beizi/ad/c/b$h;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public handleView(Landroid/view/View;Ljava/lang/String;)V
    .locals 10

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->s:I

    if-gtz v0, :cond_3

    add-int/lit8 v0, v0, 0x1

    .line 2
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->s:I

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectViewUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 4
    iget-object v2, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectViewUrl:Ljava/lang/String;

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const-string v8, ""

    const-string v9, ""

    invoke-static/range {v2 .. v9}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectViewUrl:Ljava/lang/String;

    .line 5
    new-instance v0, Lcom/beizi/ad/internal/h;

    iget-object v2, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectViewUrl:Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    new-array v2, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    const-string v0, ""

    .line 6
    iput-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->mDetectViewUrl:Ljava/lang/String;

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->O:Lcom/beizi/ad/c/b$b;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0}, Lcom/beizi/ad/c/b$b;->l()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/ad/c/b$h;

    if-eqz v3, :cond_2

    .line 11
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    if-eqz p1, :cond_2

    .line 12
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 13
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v3

    const-string v4, "__REQUESTUUID__"

    invoke-virtual {v3, v4, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {v3}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v3

    .line 15
    :goto_1
    new-instance v4, Lcom/beizi/ad/internal/h;

    invoke-static {v1, p1, v3}, Lcom/beizi/ad/internal/utilities/StringUtil;->replaceView(ILandroid/view/View;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    new-array v5, v1, [Ljava/lang/Void;

    invoke-virtual {v4, v3, v5}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public isAutoClose()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->n:Z

    return v0
.end method

.method public isAutoPlay()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->r:Z

    return v0
.end method

.method public isFullScreen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->j:Z

    return v0
.end method

.method public isManualClose()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->o:Z

    return v0
.end method

.method public isMuted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->m:Z

    return v0
.end method

.method public isVideo()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->ae:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isWifiOnly()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->l:Z

    return v0
.end method

.method public isWifiPreload()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/network/ServerResponse;->k:Z

    return v0
.end method

.method public setAdOrientation(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->e:I

    return-void
.end method

.method public setCloseMarketDialog(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->x:Z

    return-void
.end method

.method public setOpenInNativeBrowser(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/network/ServerResponse;->v:Z

    return-void
.end method
