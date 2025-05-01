.class public final Lcom/aggmoread/sdk/z/a/g/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/aggmoread/sdk/z/a/g/e;

.field public static final d:Lcom/aggmoread/sdk/z/a/g/e;

.field public static final e:Lcom/aggmoread/sdk/z/a/g/e;

.field public static final f:Lcom/aggmoread/sdk/z/a/g/e;

.field public static final g:Lcom/aggmoread/sdk/z/a/g/e;

.field public static final h:Lcom/aggmoread/sdk/z/a/g/e;


# instance fields
.field private a:I

.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/e;

    const v1, 0xc355

    const-string v2, "\u5bb9\u5668\u5df2\u9500\u6bc1\uff01"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/g/e;->c:Lcom/aggmoread/sdk/z/a/g/e;

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/e;

    const-string v2, "\u672a\u6307\u5b9a\u5e7f\u544a\u5bb9\u5668\uff01"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/g/e;->d:Lcom/aggmoread/sdk/z/a/g/e;

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/e;

    const v1, 0xc356

    const-string v2, "\u56fe\u7247\u52a0\u8f7d\u5931\u8d25\uff01"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/g/e;->e:Lcom/aggmoread/sdk/z/a/g/e;

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/e;

    const v1, 0xc357

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/g/e;->f:Lcom/aggmoread/sdk/z/a/g/e;

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/e;

    const v1, 0xc358

    const-string v2, "activity is null\uff01"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/g/e;->g:Lcom/aggmoread/sdk/z/a/g/e;

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/e;

    const v1, 0xc351

    const-string v2, "\u5e7f\u544a\u672a\u521d\u59cb\u5316\uff01"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/g/e;->h:Lcom/aggmoread/sdk/z/a/g/e;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/a/g/e;->a:I

    iput p1, p0, Lcom/aggmoread/sdk/z/a/g/e;->a:I

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/g/e;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/g/e;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JuHeApiError{errorCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/g/e;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", errorMessage=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/g/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
