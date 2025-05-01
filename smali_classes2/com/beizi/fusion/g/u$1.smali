.class Lcom/beizi/fusion/g/u$1;
.super Lcom/beizi/fusion/g/ah;
.source "DownloadApkConfirmDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/u;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/u;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-direct {p0}, Lcom/beizi/fusion/g/ah;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)V
    .locals 9

    const-string v0, "\t"

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->a(Lcom/beizi/fusion/g/u;)Landroid/widget/ProgressBar;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->b(Lcom/beizi/fusion/g/u;)Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 3
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->c(Lcom/beizi/fusion/g/u;)Landroid/view/ViewGroup;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4
    invoke-static {p1}, Lcom/beizi/fusion/g/v;->b(Ljava/lang/String;)Lcom/beizi/fusion/g/v$a;

    move-result-object p1

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {p1}, Lcom/beizi/fusion/g/u;->a(Lcom/beizi/fusion/g/u;)Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {p1}, Lcom/beizi/fusion/g/u;->b(Lcom/beizi/fusion/g/u;)Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {p1}, Lcom/beizi/fusion/g/u;->c(Lcom/beizi/fusion/g/u;)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    const-string v4, "icon\u94fe\u63a5:\n"

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v4, p1, Lcom/beizi/fusion/g/v$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    const-string v4, "\n\u5e94\u7528\u540d:\n"

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p1, Lcom/beizi/fusion/g/v$a;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    const-string v4, "\n\u5e94\u7528\u7248\u672c:\n"

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p1, Lcom/beizi/fusion/g/v$a;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    const-string v4, "\n\u5f00\u53d1\u8005:\n"

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p1, Lcom/beizi/fusion/g/v$a;->d:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    const-string v4, "\n\u5e94\u7528\u5927\u5c0f:\n"

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p1, Lcom/beizi/fusion/g/v$a;->h:J

    invoke-static {v5, v6}, Lcom/beizi/fusion/g/u;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 18
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    const-string v4, "\n\u66f4\u65b0\u65f6\u95f4:\n"

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 19
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd HH:mm"

    invoke-direct {v1, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 20
    iget-object v4, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v4}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v6, Ljava/util/Date;

    iget-wide v7, p1, Lcom/beizi/fusion/g/v$a;->g:J

    invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    const-string v4, "\n\u9690\u79c1\u6761\u6b3e\u94fe\u63a5:\n"

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 22
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v4, p1, Lcom/beizi/fusion/g/v$a;->f:Ljava/lang/String;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v1}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v1

    const-string v4, "\n\u6743\u9650\u4fe1\u606f:\n"

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v1, p1, Lcom/beizi/fusion/g/v$a;->e:Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 25
    iget-object p1, p1, Lcom/beizi/fusion/g/v$a;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 26
    iget-object v4, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v4}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 27
    :cond_1
    new-instance p1, Lcom/beizi/fusion/g/u$1$1;

    invoke-direct {p1, p0}, Lcom/beizi/fusion/g/u$1$1;-><init>(Lcom/beizi/fusion/g/u$1;)V

    .line 28
    iget-object v0, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {v0}, Lcom/beizi/fusion/g/u;->d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Landroid/util/Patterns;->WEB_URL:Ljava/util/regex/Pattern;

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v4, p1}, Landroid/text/util/Linkify;->addLinks(Landroid/widget/TextView;Ljava/util/regex/Pattern;Ljava/lang/String;Landroid/text/util/Linkify$MatchFilter;Landroid/text/util/Linkify$TransformFilter;)V

    .line 29
    iget-object p1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {p1}, Lcom/beizi/fusion/g/u;->a(Lcom/beizi/fusion/g/u;)Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 30
    iget-object p1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {p1}, Lcom/beizi/fusion/g/u;->b(Lcom/beizi/fusion/g/u;)Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 31
    iget-object p1, p0, Lcom/beizi/fusion/g/u$1;->a:Lcom/beizi/fusion/g/u;

    invoke-static {p1}, Lcom/beizi/fusion/g/u;->c(Lcom/beizi/fusion/g/u;)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/beizi/fusion/g/u$1;->a(Ljava/lang/String;)V

    return-void
.end method
