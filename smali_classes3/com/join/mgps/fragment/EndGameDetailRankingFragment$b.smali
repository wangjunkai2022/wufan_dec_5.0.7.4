.class Lcom/join/mgps/fragment/EndGameDetailRankingFragment$b;
.super Lcom/join/android/app/common/http/d$p;
.source "EndGameDetailRankingFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->g0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/android/app/common/http/d$p<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$b;->b:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    invoke-direct {p0}, Lcom/join/android/app/common/http/d$p;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$b;->b:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->a0(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)Landroid/content/Context;

    move-result-object p1

    const-string/jumbo p2, "\u56de\u653e\u5931\u8d25\uff01"

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$b;->f(Ljava/lang/String;)V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$b;->b:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    invoke-virtual {v0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->i0(Ljava/lang/String;)V

    return-void
.end method
