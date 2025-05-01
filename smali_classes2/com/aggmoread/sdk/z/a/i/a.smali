.class public final Lcom/aggmoread/sdk/z/a/i/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/aggmoread/sdk/z/a/i/a;

.field public static final c:Lcom/aggmoread/sdk/z/a/i/a;

.field public static final d:Lcom/aggmoread/sdk/z/a/i/a;

.field public static final e:Lcom/aggmoread/sdk/z/a/i/a;

.field public static final f:Lcom/aggmoread/sdk/z/a/i/a;

.field public static final g:Lcom/aggmoread/sdk/z/a/i/a;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/a/i/a;

    const/4 v1, 0x2

    const-string v2, "splash"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/i/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/i/a;->b:Lcom/aggmoread/sdk/z/a/i/a;

    new-instance v0, Lcom/aggmoread/sdk/z/a/i/a;

    const/4 v1, 0x4

    const-string v2, "informationFlow"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/i/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/i/a;->c:Lcom/aggmoread/sdk/z/a/i/a;

    new-instance v0, Lcom/aggmoread/sdk/z/a/i/a;

    const/4 v1, 0x7

    const-string v2, "express_informationFlow"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/i/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/i/a;->d:Lcom/aggmoread/sdk/z/a/i/a;

    new-instance v0, Lcom/aggmoread/sdk/z/a/i/a;

    const/4 v1, 0x1

    const-string v2, "banner"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/i/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/i/a;->e:Lcom/aggmoread/sdk/z/a/i/a;

    new-instance v0, Lcom/aggmoread/sdk/z/a/i/a;

    const/4 v1, 0x3

    const-string v2, "interstitial"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/i/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/i/a;->f:Lcom/aggmoread/sdk/z/a/i/a;

    new-instance v0, Lcom/aggmoread/sdk/z/a/i/a;

    const/4 v1, -0x1

    const-string v2, "unknow"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/i/a;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/i/a;->g:Lcom/aggmoread/sdk/z/a/i/a;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/aggmoread/sdk/z/a/i/a;->a:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/i/a;->a:I

    return v0
.end method
