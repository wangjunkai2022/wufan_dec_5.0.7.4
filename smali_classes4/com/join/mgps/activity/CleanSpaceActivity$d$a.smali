.class Lcom/join/mgps/activity/CleanSpaceActivity$d$a;
.super Ljava/lang/Object;
.source "CleanSpaceActivity.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CleanSpaceActivity$d;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/CleanSpaceActivity$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

.field final synthetic c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic d:Landroid/widget/CheckBox;

.field final synthetic e:Lcom/join/mgps/activity/CleanSpaceActivity$d;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CleanSpaceActivity$d;Landroid/widget/ImageView;Lcom/join/mgps/activity/CleanSpaceActivity$c;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/widget/CheckBox;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->e:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iput-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->a:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    iput-object p4, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-object p5, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->d:Landroid/widget/CheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    const/4 p1, 0x1

    if-eqz p2, :cond_1

    .line 1
    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->a:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p2, p1}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->l(Z)V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->e:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object p2, p2, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-static {p2}, Lcom/join/mgps/activity/CleanSpaceActivity;->f0(Lcom/join/mgps/activity/CleanSpaceActivity;)I

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->getType()I

    move-result p2

    if-ne p2, p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->e:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object p1, p1, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->h0(Lcom/join/mgps/activity/CleanSpaceActivity;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->e:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object p1, p1, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->i0(Lcom/join/mgps/activity/CleanSpaceActivity;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->c()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->e:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object v0, v0, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-virtual {v0, p2}, Lcom/join/mgps/activity/CleanSpaceActivity;->k0(Ljava/lang/String;)V

    goto :goto_1

    .line 10
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->d:Landroid/widget/CheckBox;

    invoke-virtual {p2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_2

    .line 11
    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->a:Landroid/widget/ImageView;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 12
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->l(Z)V

    .line 13
    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->e:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object p2, p2, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-static {p2}, Lcom/join/mgps/activity/CleanSpaceActivity;->g0(Lcom/join/mgps/activity/CleanSpaceActivity;)I

    .line 14
    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->getType()I

    move-result p2

    if-ne p2, p1, :cond_3

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->e:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object p1, p1, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->h0(Lcom/join/mgps/activity/CleanSpaceActivity;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    .line 16
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->e:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object p1, p1, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->i0(Lcom/join/mgps/activity/CleanSpaceActivity;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    :goto_2
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->c()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;->e:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object v0, v0, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-virtual {v0, p2}, Lcom/join/mgps/activity/CleanSpaceActivity;->A0(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    return-void
.end method
