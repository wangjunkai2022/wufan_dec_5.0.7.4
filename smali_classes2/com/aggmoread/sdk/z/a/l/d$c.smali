.class Lcom/aggmoread/sdk/z/a/l/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


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

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/l/d$c;->a:Lcom/aggmoread/sdk/z/a/l/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/l/d$c;->a:Lcom/aggmoread/sdk/z/a/l/e$a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/l/e$a;->c()V

    :cond_0
    return-void
.end method
