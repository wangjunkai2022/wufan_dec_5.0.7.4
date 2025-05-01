.class Lcom/papa/sim/statistic/http/b$i$b;
.super Ljava/lang/Object;
.source "OkHttpClientManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa/sim/statistic/http/b$i;->e(Landroid/widget/ImageView;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/ImageView;

.field final synthetic c:I

.field final synthetic d:Lcom/papa/sim/statistic/http/b$i;


# direct methods
.method constructor <init>(Lcom/papa/sim/statistic/http/b$i;Landroid/widget/ImageView;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa/sim/statistic/http/b$i$b;->d:Lcom/papa/sim/statistic/http/b$i;

    iput-object p2, p0, Lcom/papa/sim/statistic/http/b$i$b;->b:Landroid/widget/ImageView;

    iput p3, p0, Lcom/papa/sim/statistic/http/b$i$b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa/sim/statistic/http/b$i$b;->b:Landroid/widget/ImageView;

    iget v1, p0, Lcom/papa/sim/statistic/http/b$i$b;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method
