.class Lcom/aggmoread/sdk/z/a/l/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/l/d;->a(Lcom/aggmoread/sdk/z/a/t/f;Lcom/aggmoread/sdk/z/a/s/c;Lcom/aggmoread/sdk/z/a/l/e$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/l/e$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/l/d;Lcom/aggmoread/sdk/z/a/l/e$a;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/l/d$d;->a:Lcom/aggmoread/sdk/z/a/l/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/l/d$d;->a:Lcom/aggmoread/sdk/z/a/l/e$a;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "extra msg: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v0, p2, p3}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/a/l/e$a;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
